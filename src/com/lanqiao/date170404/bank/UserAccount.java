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
	 * 用户取款
	 * 
	 * @param money 需要取款金额
	 * @return 返回取款金额
	 * @throws Exception
	 */
	public boolean getMoney(double money) throws Exception {

		if (money < 100 || money > 5000) {
			throw new Exception("取款金额必须大于100，小于5000");
		}

		if (this.balance < money) {
			throw new Exception("余额不足");
		}

		//从帐号余额中扣除相应金额
		this.balance -= money;
		
		//记录日志到列表中
		String logStr = UserAccount.currentTime() + "取款 " + money +"元， 余额："+this.balance;
		this.logs.add(logStr);

		return true;
	}
	
	/**
	 * 当前系统操作时间
	 * @return
	 */
	public static String currentTime(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:ss:mm");
		return sdf.format(new Date());
	}

	/**
	 * 输出取款日志
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
