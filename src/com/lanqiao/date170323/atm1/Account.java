package com.lanqiao.date170323.atm1;
//账户类
public class Account {
	private String cardNo;// 银行卡号
	private double balance = 100000;// 余额

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

	// 从当前余额中减去金额。
	public void withdraw(double leftMoney) throws OverDraftException {
		if (leftMoney >= balance) {
			throw new OverDraftException("您的账号资金不足", leftMoney - balance);
		}
		balance -= leftMoney;
	}
}
