package com.lanqiao.date170407.atm3;

//�û���
public class User {
	private String name;// ����
	private Account account;
	private int pwd;

	public User(String name, Account account, int pwd) {
		super();
		this.name = name;
		this.account = account;
		this.pwd = pwd;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getPwd() {
		return pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
