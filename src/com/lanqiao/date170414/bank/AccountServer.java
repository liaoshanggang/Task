package com.lanqiao.date170414.bank;



import java.util.Scanner;

/*
 * ����2�� ATM
 * ��ʼҪ�󣺿�Ĭ��100000
 * ¼�룺���п��ţ�ȡ����Ǯ������
 * �쳣��������Ų��� 1234-123456-1234AB
 * Ǯ����100 - 30000
 * ���룺6λ��
 * ��ӡ��������ǰȡ����
 * ��ʣ����
 * -----------
 * ȡ�����     ��� 
 *  1    150.00
 *  2    1000.00
 *  
 *  ATM ��־������
 *  ATM ��־������ļ�
 *  �˻�ID | ȡ����־��Ϣ
 *  �û��´ε�¼ʱ��ѡ���ѯ�����ڿ���̨��ʾ֮ǰ��ȡ����Ϣ
 */
public class AccountServer {

	
	public static void main(String[] args) {
		
		AccountServer server = new AccountServer();		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * ATM 7*24 ���У����������ѭ���ǲ����˳��ģ����Ƕϵ�
		 */
		while(true){
			System.out.println("��ӭʹ������ ATM ϵͳ");
			
			//��ȡ�û����ʺ�������
			System.out.print("����������ʺ�:");
			String loginAccount = sc.nextLine();
			
			System.out.print("�������������:");
			String loginPwd = sc.nextLine();
			
			try {
				//����ʺ�������ȷ�����ض�Ӧ��UserAccount����ע��loginUA��ʲô
				UserAccount loginUA = server.checkAccount(loginAccount,loginPwd);
				
				System.out.println("��ã��˻���"+ loginUA.getBalance());
				System.out.println("======================================");
				
				//ȡ������
				while(true){			
					System.out.println("������ȡ����������100��С��30000");
					
					double money = sc.nextDouble();
					//ȡǮ��
					server.getMoney(loginUA, money);
					sc.nextLine();// nextDouble()����money������û�ж���"\n",���ò�����һ�������nextLine()���ã���ȥ���еĽ�����
					
					System.out.println("����ȡ���� Y or N");
					String selec = sc.nextLine();
					
					if(selec.equalsIgnoreCase("N")){
						loginUA.modifyAccountInfo(); //�˳�ʱ�޸��˻���Ϣ
						loginUA = null;
						System.out.println("bye...");
						break;
					}
					
				}
				
			} catch (Exception e) {
				System.err.println(e.getMessage() + "�����µ�¼���� ");
				System.out.println();
			} 
		}
		
	}
	

	/**
	 * ȡ��
	 * @param loginUA ��ǰ��¼���˻�
	 * @param money ȡ����
	 */
	private void getMoney(UserAccount loginUA, double money) {
		try {
			//��Ҫ�ķ������÷�����UserAccount��һ������
			if(loginUA.getMoney(money)){
				System.out.println("ȡ��ɹ������ջ�������п���ʣ����� "+loginUA.getBalance());
				System.out.println("==============================");
				
				//�����־
				System.out.println(loginUA.showLog());
				
			}
		} catch (UserException e) {
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * ��¼
	 * @param id  �˻�ID
	 * @param password ����
	 * @return ��¼�ɹ�����û��˻�
	 * @throws LoginException 
	 * @throws Exception 
	 */
	private UserAccount checkAccount(String id, String password) throws UserException, LoginException{
		
		UserRecordUtils ur = new UserRecordUtils();
		UserAccount loginAccount = ur.getAccount(id,password);
		
		if(loginAccount==null){
			throw new LoginException("�˻������ڣ���ȷ���ʺŻ������Ƿ���ȷ");
		}
		
		return loginAccount;
		
	}
	
	

}
