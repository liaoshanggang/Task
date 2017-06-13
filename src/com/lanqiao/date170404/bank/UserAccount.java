package com.lanqiao.date170404.bank;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <p>
 * Title:UserAccount
 * </P>
 * <p>
 * Description: �����û����ʺ���Ϣ��id��password��balance��list<String>
 * </p>
 * <P>
 * Company:
 * </p>
 * 
 * @author SEAN HU
 * @date 2017��3��24�� ����4:11:33
 * 
 */
public class UserAccount {

	// �����ʺ�
	private String id;

	// ����
	private String password;

	// ���
	private double balance;

	// ȡ����־
	private List<String> logs;

	public UserAccount(String id, String password, double balance) {
		super();
		this.id = id;
		this.password = password;
		this.balance = balance;
		logs = new LinkedList<>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<String> getLogs() {
		return logs;
	}

	public void setLogs(List<String> logs) {
		this.logs = logs;
	}
	
	public boolean checkPassword(String loginPwd){
		if(loginPwd.equals(this.password)){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * �û�ȡ��
	 * 
	 * @param money ��Ҫȡ����
	 * @return ����ȡ����
	 * @throws Exception
	 */
	public boolean getMoney(double money) throws Exception {

		if (money < 100 || money > 5000) {
			throw new Exception("ȡ����������100��С��5000");
		}

		if (this.balance < money) {
			throw new Exception("����");
		}

		//���ʺ�����п۳���Ӧ���
		this.balance -= money;
		
		//��¼��־���б���
		String logStr = UserAccount.currentTime() + "ȡ�� " + money +"Ԫ�� ��"+this.balance;
		this.logs.add(logStr);

		return true;
	}
	
	/**
	 * ��ǰϵͳ����ʱ��
	 * @return
	 */
	public static String currentTime(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:ss:mm");
		return sdf.format(new Date());
	}

	/**
	 * ���ȡ����־
	 * @return
	 */
	public String showLog() {

		StringBuffer sbf = new StringBuffer();

		for (String str : logs) {
			sbf.append(str);
		}

		return sbf.toString();
	}

	@Override
	public String toString() {
		return "UserAccount [id=" + id + ", password=" + password + ", balance=" + balance + "]";
	}

}
