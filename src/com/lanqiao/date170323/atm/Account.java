package com.lanqiao.date170323.atm;

public class Account {
	private String cardNo;//“¯––ø®∫≈
	private double balance = 100000;//”‡∂Ó

	public Account() {
		super();
	}

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public Account(String cardNo, double balance) {
		super();
		this.cardNo = cardNo;
		this.balance = balance;
	}

	public String getCardNo() {
		return cardNo;
	}

	public double getBalance() {
		return balance;
	}

}
