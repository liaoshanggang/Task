package com.lanqiao.date170409.atm4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//需求2： ATM 初始要求：卡默认100000
//录入：银行卡号，取多少钱，密码 
//异常：如果卡号不对 1234-123456-1234AB 
//钱数：100 - 30000 
//密码：6 
//打印出来：当前取多少 还剩多少
//----------- 
//取款次数 金额
//1     150.00 
//2     1000.00

// 管理类
public class Manager {
	static Scanner in = new Scanner(System.in);
	// List record = new ArrayList();// 记录每次取前成功的记录
	static List<User> users;// 存放用户的记录
	private String cardNo = "";// 记录卡号

	public static final String AC1 = "1111222233334444";
	public static final String AC2 = "1111222233335555";
	public static final String AC3 = "1111222233336666";

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
		buzMenu();
		// print();// 打印取款记录
	}

	private void buzMenu() {
		while (true) {
			System.out.println("======ATM业务页面=======");
			System.out.println("1.取款");
			System.out.println("2.存款");
			System.out.println("3.查询记录");
			System.out.println("4.打印凭条");
			System.out.println("0.退出系统");
			System.out.println("请选择您要进行的业务：");
			int sel = in.nextInt();
			switch (sel) {
			case 0:
				endMenu();// 结束选择界面
				break;
			case 1:
				withdrawMenu();// 取款数界面
				break;
			case 2:
				System.out.println("该模块未实现！");
				break;
			case 3:
				readFileLogs();
				break;
			case 4:
				print();
				break;
			default:
				System.out.println("该模块未实现！");
				break;
			}
		}

	}

	private void print() {
		// TODO 自动生成的方法存根
		System.out.println("该模块未实现！");
	}

	private void endMenu() {
		System.out.println("=========结束界面===========");
		String userSel = "";
		do {
			System.out.println("是否继续交易:(y|n)");
			userSel = in.next();
			if (userSel.equals("n")) {
				showRecord();
				mainMenu();
				break;
			} else {
				buzMenu();
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
				// record.add(money);
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

	// 显示取款次数记录
	/*
	 * private void print() { System.out.println("取款次数\t金额"); for (int i = 0; i
	 * < record.size(); i++) { System.out.println((i + 1) + "\t" +
	 * record.get(i)); } }
	 */

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
		System.out.println("本次交易成功，请收回你的银行卡，剩余余额 " + u.getAccount().getBalance());
		System.out.println();
	}

	// public void showRecord() {
	// User u = Manager.getCustomer(cardNo);
	// FileOutputStream fos = null;
	// try {
	// fos = new FileOutputStream(
	// "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170407\\atm3\\logs.txt",
	// true);
	// System.out.println("交易成功，请收回你的银行卡，剩余余额 "
	// + u.getAccount().getBalance());
	// System.out.println("==========================");
	// String ss = u.getAccount().showLog();
	// System.out.println("内存读取记录");
	// System.out.println(ss);
	// byte[] b = new byte[5];
	// // 输出日志
	// String s = "卡号："+u.getAccount().getCardNo()+"记录\n";
	// fos.write(s.getBytes());
	// for (String str : u.getAccount().getLogs()) {
	// System.out.println(str);
	// b = new String(str + "\n").getBytes();
	// fos.write(b);
	// }
	// } catch (Exception e) {
	// System.out.println("hello");
	// System.out.println(e.getMessage());
	// } finally {
	// try {
	// if (fos != null)
	// fos.close();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
	// }

	// 用户下次登录时，选择查询，能在控制台显示之前的取款信息
	private void readFileLogs() {
		System.out.println("=======读取取款记录界面========");
		User u = Manager.getCustomer(cardNo);
		try (BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(
						"D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170409\\atm4\\"
								+ u.getAccount().getCardNo() + "logs.txt"));) {
			byte[] b = new byte[1024];
			int c = 0;
			while ((c = bis.read(b)) != -1) {
				System.out.println(new String(b, 0, c));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 验证密码
	private boolean verifyPwd(int pwd) {
		boolean flag = false;
		String s = "";
		s = String.valueOf(pwd);
		try {
			User u = Manager.getCustomer(cardNo);
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
						break;
					} else {
						flag = false;
					}
				}
				if (flag = true) {
					System.out.println("银行卡号正确！");// 卡号位数正确并且存在该银行卡号
				} else {
					throw new Exception("卡号" + cardNo + "不存在！");
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
