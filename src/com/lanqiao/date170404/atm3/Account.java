package com.lanqiao.date170404.atm3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

//�˻���
public class Account {
	private String cardNo;// ���п���
	private double balance = 100000.00;// ���
	private List<String> logs;// ȡ����־

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
		logs = new LinkedList<>();
	}

	// �ӵ�ǰ����м�ȥ��
	public boolean withdraw(double leftMoney) throws Exception {
		if (leftMoney >= balance) {
			throw new Exception("�����˺�����");
		}
		balance -= leftMoney;
		System.out.println("ȡ��ɹ���");
		// ��¼��־���б���
		String logStr = Account.currentTime() + "ȡ�� " + leftMoney + "Ԫ�� ��"
				+ balance;
		this.logs.add(logStr);
		return true;
	}

	/**
	 * ��ǰϵͳ����ʱ��
	 */
	public static String currentTime() {
		long ct = System.currentTimeMillis();
		Date d = new Date(ct);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:ss:mm");
		return sdf.format(d);
	}

	/**
	 * ���ȡ����־
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
		return "Account [cardNo=" + cardNo + ", balance=" + balance + ", logs="
				+ logs + "]";
	}

	public String getCardNo() {
		return cardNo;
	}

	public double getBalance() {
		return balance;
	}

	public List<String> getLogs() {
		return logs;
	}

	public void setLogs(List<String> logs) {
		this.logs = logs;
	}
}