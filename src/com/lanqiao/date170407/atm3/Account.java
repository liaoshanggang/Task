package com.lanqiao.date170407.atm3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

//账户类
public class Account {
	private String cardNo;// 银行卡号
	private double balance = 100000.00;// 余额
	private List<String> logs;// 取款日志
	private static int count;

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

	// 从当前余额中减去金额。
	public boolean withdraw(double leftMoney) throws Exception {
		if (leftMoney >= balance) {
			throw new Exception("您的账号余额不足");
		}
		balance -= leftMoney;
		System.out.println("取款成功！");
		// 记录日志到列表中
		String logStr = Account.currentTime() + "取款 " + leftMoney + "元， 余额："
				+ balance;

		// 把记录日记存到文件中去
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("D:\\WorkSpace\\Task\\src\\com\\lanqiao"
					+ "\\date170407\\atm3\\" + cardNo + "logs.txt", true);
			byte[] b = new byte[5];
			String s = "卡号：" + cardNo + "\t记录";
			fos.write(s.getBytes());
			b = new String(logStr + "\n").getBytes();
			fos.write(b);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			if (fos != null) {
				fos.close();
			}
		}

		this.logs.add(logStr);
		count++;
		return true;
	}

	/**
	 * 当前系统操作时间
	 */
	public static String currentTime() {
		long ct = System.currentTimeMillis();
		Date d = new Date(ct);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:ss:mm");
		return sdf.format(d);
	}

	/**
	 * 输出取款日志
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
