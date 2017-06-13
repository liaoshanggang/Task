package com.lanqiao.date170323.atm1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * 
需求2： ATM
初始要求：卡默认100000
录入：银行卡号，取多少钱，密码
异常：如果卡号不对 1234-123456-1234AB
      钱数：100 - 30000
	  密码：6
打印出来：当前取多少
          还剩多少
		  -----------
		  取款次数  金额
		  1         150.00
		  2         1000.00
 * @author gg
 *
 */
//管理类
public class Manager {
	static Scanner in = new Scanner(System.in);
	List record = new ArrayList();// 记录每次取前成功的记录
	List users = new ArrayList();// 存放用户的记录
	private String cardNo = "";// 记录卡号

	public Manager() {
	}

	public void mainMenu() {
		System.out.println("===欢迎进入ATM===");
		cardInputMenu();// 卡号输入界面
		passwordInputMenu();// 密码输入界面
		withdrawMenu();// 取款数界面
		print();// 打印取款记录
		endMenu();//结束选择界面
	}

	private void endMenu() {
		String userSel = "";
		do {
			System.out.println("是否继续交易:(y|n)");
			userSel = in.next();
			if (userSel.equals("n")) {
				mainMenu();
				break;
			}
		} while (true);
	}

	private void withdrawMenu() {
		System.out.println("===取款数界面===");
		int money;
		String userSel = "";
		do {
			System.out.println("请输入您的取款数：");
			money = in.nextInt();
			if (verifyMoney(money)) {
				record.add(money);
				System.out.println("是否继续取款：(y|n)");
				userSel = in.next();
				if (userSel.equals("n")) {
					break;
				}
			}
		} while (true);
	}

	private void passwordInputMenu() {
		System.out.println("===密码输入界面===");
		int pwd;
		do {
			System.out.println("请输入您的密码：");
			pwd = in.nextInt();
		} while (!verifyPwd(pwd));
	}

	private void cardInputMenu() {
		System.out.println("===卡号输入界面===");
		do {
			System.out.println("请输入您的卡号：");
			cardNo = in.next();
		} while (!verifyCardNO(cardNo));
	}

	// 显示取款记录
	private void print() {
		System.out.println("取款次数\t金额");
		for (int i = 0; i < record.size(); i++) {
			System.out.println((i + 1) + "\t" + record.get(i));
		}
	}

	// 验证取钱数
	private boolean verifyMoney(int money) {
		boolean flag = false;
		User u = this.getCustomer(cardNo);
		try {
			if (money < 100 || money > 30000) {// 验证取钱额度
				flag = false;
				throw new MoneyException("取钱数不合理！");
			} else {
				if (money % 100 == 0) {
					u.getAccount().withdraw(money);
					flag = true;
				} else {
					throw new MoneyException("请整取钱数！");
				}
			}
		} catch (MoneyException e) {
			flag = false;
			System.out.println(e.getMessage());
		} catch (OverDraftException e) {
			flag = false;
			System.out.println(e.getMessage());
		}
		return flag;
	}

	// 验证密码
	private boolean verifyPwd(int pwd) {
		boolean flag = false;
		String s = "";
		s = s.valueOf(pwd);
		try {
			User u = this.getCustomer(cardNo);
			if (s.length() != 6) {// 验证密码长度
				flag = false;
				throw new PasswordException("密码长度不合理！");
			} else {
				if (u.getPwd() == pwd) {
					flag = true;// 卡号位数正确并且存在该银行卡号
					System.out.println("密码正确！");
				} else {
					flag = false;
					throw new PasswordException("密码不正确！");
				}
			}
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	// 验证卡号
	private boolean verifyCardNO(String cardNo) {
		boolean flag = false;
		try {
			if (cardNo.length() > 16) {// 验证卡号长度
				flag = false;
				throw new CardNoException("卡号长度不合理！");
			} else {
				for (Object object : users) {
					User u = (User) object;
					if (u.getAccount().getCardNo().equals(cardNo)) {
						flag = true;// 卡号位数正确并且存在该银行卡号
						break;
					} else {
						flag = false;
					}
				}
				if (flag = true) {
					System.out.println("银行卡号正确！");
				} else {
					throw new CardNoException("卡号" + cardNo + "不存在！");
				}
			}
		} catch (CardNoException e) {
			System.out.println(e.toString());
		}
		return flag;
	}

	// 获得指定名字的用户
	public User getCustomer(String cardNo) {
		User u = null;
		for (Object object : users) {
			u = (User) object;
			if (u.getAccount().getCardNo().equals(cardNo)) {
				break;
			}
		}
		return u;
	}

	// 添加用户
	public void addCustomer(User u) {
		users.add(u);
	}

}
