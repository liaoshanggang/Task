package com.lanqiao.date170323.atm;
/*char c = ' ';

for (int i = 0; i < cardNo.length(); i++) {
	c = cardNo.charAt(i);
	c = '0';
	if(c!=48){
		
	}
}*/
public class User {
	private Account account;
	private int pwd;

	public User() {
		super();
	}

	public User(Account account, int pwd) {
		super();
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
}
