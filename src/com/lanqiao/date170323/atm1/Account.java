package com.lanqiao.date170323.atm1;
//�˻���
public class Account {
	private String cardNo;// ���п���
	private double balance = 100000;// ���

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

	// �ӵ�ǰ����м�ȥ��
	public void withdraw(double leftMoney) throws OverDraftException {
		if (leftMoney >= balance) {
			throw new OverDraftException("�����˺��ʽ���", leftMoney - balance);
		}
		balance -= leftMoney;
	}
}
