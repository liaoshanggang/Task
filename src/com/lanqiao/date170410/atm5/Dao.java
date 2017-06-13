package com.lanqiao.date170410.atm5;

/**
 * @Description: Dao抽象类
 * @author 廖尚岗
 * @date 2017年4月10日 上午11:02:58
 * @version V1.0
 */
public abstract interface Dao {
	public abstract User getUser(String inputId);
	public abstract String getId(String inputId);
	public abstract String getName(String inputId);
	public abstract String getPwd(String inputId);
	public abstract double getBalance(String inputId);
	
	public abstract void readUserInfo();
	public abstract boolean writeUserInfo(String inputId,double balance);
}
