package com.lanqiao.date170404.bank;

import java.util.HashMap;
import java.util.Map;
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
 */
public class AccountServer {

	public static final String AC1 = "1111-111111-1111AA";
	public static final String AC2 = "2222-222222-2222BB";
	public static final String AC3 = "3333-333333-3333CC";
	public static final String AC4 = "4444-444444-4444DD";
	
	public static final String INIT_PWD = "123456";

	public static final Double INIT_BLANCE = 100000.00;
	
	static Map<String,UserAccount> ua = null;
	
	static{
		ua = new HashMap<>();		
		ua.put(AC1, new UserAccount(AC1,INIT_PWD,INIT_BLANCE));
		ua.put(AC2, new UserAccount(AC2,INIT_PWD,INIT_BLANCE));
		ua.put(AC3, new UserAccount(AC3,INIT_PWD,INIT_BLANCE));
		ua.put(AC4, new UserAccount(AC4,INIT_PWD,INIT_BLANCE));
		
	}
	
	public static void main(String[] args) {
		
		AccountServer server = new AccountServer();
		Scanner sc = new Scanner(System.in);
		
		UserAccount loginUA = null;
		
		/*
		 * ATM 7*24 ���У����������ѭ���ǲ����˳��ģ����Ƕϵ�
		 */
		while(true){			
			System.out.println("��ӭʹ������ ATM ϵͳ");
			
			//��ȡ�û����ʺ�������
			System.out.println("����������ʺ�");
			String loginAccount = sc.nextLine();
			
			System.out.println("�������������");
			String loginPwd = sc.nextLine();
			
			try {
				//����ʺ�������ȷ�����ض�Ӧ��UserAccount����ע��loginUA��ʲô
				loginUA = server.checkAc(loginAccount,loginPwd);
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
						System.out.println("bye...");
						break;
					}
				}
				
			} catch (Exception e) {
				System.out.println(">>> �ʺ����벻��ȷ�����µ�¼���� <<<");
				System.out.println("");
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
				for (String str : loginUA.getLogs()) {
					System.out.println(str);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * ��¼
	 * @param id  �˻�ID
	 * @param password ����
	 * @return ��¼�ɹ�����û��˻�
	 * @throws Exception 
	 */
	private UserAccount checkAc(String id, String password) throws Exception{
		
		UserAccount loginAccount = null;
		
		if(ua.containsKey(id)){
			loginAccount = ua.get(id);
			if(!loginAccount.checkPassword(password)){
				throw new Exception("�������");
			}
		}else{
			throw new Exception("�˻�������");
		}
		
		return loginAccount;
		
	}
	
	

}
