package com.lanqiao.date170409.atm4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//����2�� ATM ��ʼҪ�󣺿�Ĭ��100000
//¼�룺���п��ţ�ȡ����Ǯ������ 
//�쳣��������Ų��� 1234-123456-1234AB 
//Ǯ����100 - 30000 
//���룺6 
//��ӡ��������ǰȡ���� ��ʣ����
//----------- 
//ȡ����� ���
//1     150.00 
//2     1000.00

// ������
public class Manager {
	static Scanner in = new Scanner(System.in);
	// List record = new ArrayList();// ��¼ÿ��ȡǰ�ɹ��ļ�¼
	static List<User> users;// ����û��ļ�¼
	private String cardNo = "";// ��¼����

	public static final String AC1 = "1111222233334444";
	public static final String AC2 = "1111222233335555";
	public static final String AC3 = "1111222233336666";

	public static final int INIT_PWD = 123456;

	public static final Double INIT_BLANCE = 100000.00;

	// ��̬��ʼ���û�����ϵͳ����ǰ���Ѿ������ˡ�
	static {
		users = new ArrayList<User>();
		users.add(new User("����", new Account(AC1, INIT_BLANCE), INIT_PWD));
		users.add(new User("����", new Account(AC2, INIT_BLANCE), INIT_PWD));
		users.add(new User("����", new Account(AC3, INIT_BLANCE), INIT_PWD));
	}

	public Manager() {
	}

	public void mainMenu() {
		System.out.println("===��ӭ����ATM===");
		cardInputMenu();// �����������
		passwordInputMenu();// �����������
		buzMenu();
		// print();// ��ӡȡ���¼
	}

	private void buzMenu() {
		while (true) {
			System.out.println("======ATMҵ��ҳ��=======");
			System.out.println("1.ȡ��");
			System.out.println("2.���");
			System.out.println("3.��ѯ��¼");
			System.out.println("4.��ӡƾ��");
			System.out.println("0.�˳�ϵͳ");
			System.out.println("��ѡ����Ҫ���е�ҵ��");
			int sel = in.nextInt();
			switch (sel) {
			case 0:
				endMenu();// ����ѡ�����
				break;
			case 1:
				withdrawMenu();// ȡ��������
				break;
			case 2:
				System.out.println("��ģ��δʵ�֣�");
				break;
			case 3:
				readFileLogs();
				break;
			case 4:
				print();
				break;
			default:
				System.out.println("��ģ��δʵ�֣�");
				break;
			}
		}

	}

	private void print() {
		// TODO �Զ����ɵķ������
		System.out.println("��ģ��δʵ�֣�");
	}

	private void endMenu() {
		System.out.println("=========��������===========");
		String userSel = "";
		do {
			System.out.println("�Ƿ��������:(y|n)");
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
		System.out.println("===ȡ��������===");
		int money;
		String userSel = "";
		do {
			System.out.println("����������ȡ������");
			money = in.nextInt();
			if (verifyMoney(money)) {
				// record.add(money);
				System.out.println("�Ƿ����ȡ�(y|n)");
				userSel = in.next();
				if (userSel.equals("n")) {
					break;
				}
			}
		} while (true);
	}

	private void passwordInputMenu() {
		System.out.println("===�����������===");
		int pwd;
		do {
			System.out.println("�������������룺");
			pwd = in.nextInt();
		} while (!verifyPwd(pwd));
	}

	private void cardInputMenu() {
		System.out.println("===�����������===");
		do {
			System.out.println("���������Ŀ��ţ�");
			cardNo = in.next();
		} while (!verifyCardNO(cardNo));
	}

	// ��ʾȡ�������¼
	/*
	 * private void print() { System.out.println("ȡ�����\t���"); for (int i = 0; i
	 * < record.size(); i++) { System.out.println((i + 1) + "\t" +
	 * record.get(i)); } }
	 */

	// ��֤ȡǮ��
	private boolean verifyMoney(int money) {
		User u = Manager.getCustomer(cardNo);
		boolean flag = false;
		// User u = Manager.getCustomer(cardNo);
		try {
			if (money < 100 || money > 30000) {// ��֤ȡǮ���
				flag = false;
				throw new Exception("ȡǮ��������");
			} else {
				if (money % 100 == 0) {
					u.getAccount().withdraw(money);
					flag = true;
				} else {
					flag = false;
					throw new Exception("����ȡǮ����");
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
		System.out.println("���ν��׳ɹ������ջ�������п���ʣ����� " + u.getAccount().getBalance());
		System.out.println();
	}

	// public void showRecord() {
	// User u = Manager.getCustomer(cardNo);
	// FileOutputStream fos = null;
	// try {
	// fos = new FileOutputStream(
	// "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170407\\atm3\\logs.txt",
	// true);
	// System.out.println("���׳ɹ������ջ�������п���ʣ����� "
	// + u.getAccount().getBalance());
	// System.out.println("==========================");
	// String ss = u.getAccount().showLog();
	// System.out.println("�ڴ��ȡ��¼");
	// System.out.println(ss);
	// byte[] b = new byte[5];
	// // �����־
	// String s = "���ţ�"+u.getAccount().getCardNo()+"��¼\n";
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

	// �û��´ε�¼ʱ��ѡ���ѯ�����ڿ���̨��ʾ֮ǰ��ȡ����Ϣ
	private void readFileLogs() {
		System.out.println("=======��ȡȡ���¼����========");
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

	// ��֤����
	private boolean verifyPwd(int pwd) {
		boolean flag = false;
		String s = "";
		s = String.valueOf(pwd);
		try {
			User u = Manager.getCustomer(cardNo);
			if (s.length() != 6) {// ��֤���볤��
				flag = false;
				throw new Exception("���볤�Ȳ�����");
			} else {
				if (u.getPwd() == pwd) {
					flag = true;// ����λ����ȷ���Ҵ��ڸ����п���
					System.out.println("������ȷ��");
				} else {
					flag = false;
					throw new Exception("���벻��ȷ��");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	// ��֤����
	private boolean verifyCardNO(String cardNo) {
		boolean flag = false;
		try {
			if (cardNo.length() != 16) {// ��֤���ų���
				flag = false;
				throw new Exception("���ų��Ȳ�����");
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
					System.out.println("���п�����ȷ��");// ����λ����ȷ���Ҵ��ڸ����п���
				} else {
					throw new Exception("����" + cardNo + "�����ڣ�");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	// ���ָ�����ֵ��û�
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
