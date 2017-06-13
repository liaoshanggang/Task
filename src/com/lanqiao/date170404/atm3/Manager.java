package com.lanqiao.date170404.atm3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 需求2： ATM 初始要求：卡默认100000
  录入：银行卡号，取多少钱，密码 
  异常：如果卡号不对 1234-123456-1234AB 
  钱数：100 - 30000 
  密码：6 
  打印出来：当前取多少 还剩多少
   ----------- 
   取款次数 金额
    1 150.00 
   	2 1000.00
 * 
 * @author gg
 *
 */
// 管理类
public class Manager {
	static Scanner in = new Scanner(System.in);
	List record = new ArrayList();// 记录每次取前成功的记录
	static List<User> users;// 存放用户的记录
	private String cardNo = "";// 记录卡号

	public static final String AC1 = "1234123456123490";
	public static final String AC2 = "1234123456123480";
	public static final String AC3 = "1234123456123430";

	public static final int INIT_PWD = 123456;

	public static final Double INIT_BLANCE = 100000.00;

	// 静态初始化用户，在系统启动前就已经存在了。
	static {
		users = new ArrayList<User>();
		users.add(new User("张三", new Account(AC1, INIT_BLANCE), INIT_PWD));
		users.add(new User("李四", new Account(AC2, INIT_BLANCE), INIT_PWD));
		users.add(new User("王五", new Account(AC3, INIT_BLANCE), INIT_PWD));
	}

	public Manager() {
	}

	public void mainMenu() {
		System.out.println("===欢迎进入ATM===");
		cardInputMenu();// 卡号输入界面
		passwordInputMenu();// 密码输入界面
		withdrawMenu();// 取款数界面
		print();// 打印取款记录
		endMenu();// 结束选择界面
	}

	private void endMenu() {
		String userSel = "";
		do {
			System.out.println("是否继续交易:(y|n)");
			userSel = in.next();
			if (userSel.equals("n")) {
				showRecord();
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
		User u = Manager.getCustomer(cardNo);
		boolean flag = false;
		// User u = Manager.getCustomer(cardNo);
		try {
			if (money < 100 || money > 30000) {// 验证取钱额度
				flag = false;
				throw new Exception("取钱数不合理！");
			} else {
				if (money % 100 == 0) {
					u.getAccount().withdraw(money);
					flag = true;
				} else {
					flag = false;
					throw new Exception("请整取钱数！");
				}
			}
		} catch (Exception e) {
			flag = false;
			System.out.println(e.getMessage());
		}
		return flag;
	}

	public void showRecord() {
		User u = Manager.getCustomer(cardNo);
		try {
			System.out.println("取款成功，请收回你的银行卡，剩余余额 "
					+ u.getAccount().getBalance());
			System.out.println("==============================");
			// 输出日志
			for (String str : u.getAccount().getLogs()) {
				System.out.println(str);
			}
		} catch (Exception e) {
			System.out.println("hello");
			System.out.println(e.getMessage());
		}
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
				throw new Exception("密码长度不合理！");
			} else {
				if (u.getPwd() == pwd) {
					flag = true;// 卡号位数正确并且存在该银行卡号
					System.out.println("密码正确！");
				} else {
					flag = false;
					throw new Exception("密码不正确！");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	// 验证卡号
	private boolean verifyCardNO(String cardNo) {
		boolean flag = false;
		try {
			if (cardNo.length() != 16) {// 验证卡号长度
				flag = false;
				throw new Exception("卡号长度不合理！");
			} else {
				for (User u : users) {
					if (u.getAccount().getCardNo().equals(cardNo)) {
						flag = true;
						System.out.println("银行卡号正确！");// 卡号位数正确并且存在该银行卡号
						break;
					} else {
						flag = false;
						throw new Exception("卡号" + cardNo + "不存在！");
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	// 获得指定名字的用户
	public static User getCustomer(String cardNo) {
		User u = null;
		for (Object object : users) {
			u = (User) object;
			if (u.getAccount().getCardNo().equals(cardNo)) {
				break;
			}
		}
		return u;
	}
}
