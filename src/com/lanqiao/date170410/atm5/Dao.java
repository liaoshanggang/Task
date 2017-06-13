package com.lanqiao.date170410.atm5;

/**
 * @Description: Dao������
 * @author ���и�
 * @date 2017��4��10�� ����11:02:58
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
