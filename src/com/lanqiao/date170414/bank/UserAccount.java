package com.lanqiao.date170414.bank;



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
	//private List<String> logs;
	
	

	public UserAccount(String id, String password, double balance) {
		super();
		this.id = id;
		this.password = password;
		this.balance = balance;
		//logs = new LinkedList<>();
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

	/*public List<String> getLogs() {
		return logs;
	}

	public void setLogs(List<String> logs) {
		this.logs = logs;
	}*/
	
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
	 * @throws UserException 
	 * @throws Exception
	 */
	public boolean getMoney(double money) throws UserException {
		
		if (money < 100 || money > 5000 || money%100!=0) {
			throw new UserException("ȡ����������100��С��5000");
		}

		if (this.balance < money) {
			throw new UserException("�˻�����");
		}

		//���ʺ�����п۳���Ӧ���
		this.balance -= money;
		
		
		String logStr = currentTime() + " ȡ�� " + money +"Ԫ�� ��"+this.balance;
		recordLog(logStr); //��¼��־���ļ�
		
		//this.logs.add(logStr);//���β�����¼

		return true;
	}
	
	/*
	 * �����û��˻���Ϣ
	 * ���������˻����ҵ��ü�¼�󣬸������ݣ���д�����˻��ļ�
	 */
	public void modifyAccountInfo() {
		new UserRecordUtils().updateAccount(this);
	}

	private boolean recordLog(String logStr){
		logStr = this.id + "|" +logStr;
		return new UserRecordUtils().writerLog(UserRecordUtils.USER_LOG_FILE_PATH,logStr,true);
	}
	
	/**
	 * ��ǰϵͳ����ʱ��
	 * @return
	 */
	public String currentTime(){
		long ct = System.currentTimeMillis();
		Date d = new Date(ct);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:ss:mm");
		return sdf.format(d);
	}

	/**
	 * ���ȡ����־
	 * @return
	 */
	public String showLog() {

		StringBuffer sbf = new StringBuffer();
		
		List<String> logs = 
				new UserRecordUtils().userLogs(this.id,UserRecordUtils.SHOW_LOG_SIZE);
		
		for (String str : logs) {
			sbf.append(str).append("\r\n");
		}

		return sbf.toString();
	}
	
	/*
	 * 1111-111111-1111AA|123456|100000.00
	 */
	public String getFormatedInfo(){
		return this.id+"|"+this.password+"|"+this.balance;
	}

	@Override
	public String toString() {
		return "UserAccount [id=" + id + ", password=" + password + ", balance=" + balance + "]";
	}
	

}
