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
 * Description: 保存用户的帐号信息：id，password，balance，list<String>
 * </p>
 * <P>
 * Company:
 * </p>
 * 
 * @author SEAN HU
 * @date 2017年3月24日 下午4:11:33
 * 
 */
public class UserAccount {

	// 银行帐号
	private String id;

	// 密码
	private String password;

	// 余额
	private double balance;

	// 取款日志
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
	 * 用户取款
	 * 
	 * @param money 需要取款金额
	 * @return 返回取款金额
	 * @throws UserException 
	 * @throws Exception
	 */
	public boolean getMoney(double money) throws UserException {
		
		if (money < 100 || money > 5000 || money%100!=0) {
			throw new UserException("取款金额必须大于100，小于5000");
		}

		if (this.balance < money) {
			throw new UserException("账户余额不足");
		}

		//从帐号余额中扣除相应金额
		this.balance -= money;
		
		
		String logStr = currentTime() + " 取款 " + money +"元， 余额："+this.balance;
		recordLog(logStr); //记录日志到文件
		
		//this.logs.add(logStr);//当次操作记录

		return true;
	}
	
	/*
	 * 更新用户账户信息
	 * 分析：在账户中找到该记录后，更新数据，重写整个账户文件
	 */
	public void modifyAccountInfo() {
		new UserRecordUtils().updateAccount(this);
	}

	private boolean recordLog(String logStr){
		logStr = this.id + "|" +logStr;
		return new UserRecordUtils().writerLog(UserRecordUtils.USER_LOG_FILE_PATH,logStr,true);
	}
	
	/**
	 * 当前系统操作时间
	 * @return
	 */
	public String currentTime(){
		long ct = System.currentTimeMillis();
		Date d = new Date(ct);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:ss:mm");
		return sdf.format(d);
	}

	/**
	 * 输出取款日志
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
