package com.lanqiao.date170404.atm3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 ����2�� ATM ��ʼҪ�󣺿�Ĭ��100000
  ¼�룺���п��ţ�ȡ����Ǯ������ 
  �쳣��������Ų��� 1234-123456-1234AB 
  Ǯ����100 - 30000 
  ���룺6 
  ��ӡ��������ǰȡ���� ��ʣ����
   ----------- 
   ȡ����� ���
    1 150.00 
   	2 1000.00
 * 
 * @author gg
 *
 */
// ������
public class Manager {
	static Scanner in = new Scanner(System.in);
	List record = new ArrayList();// ��¼ÿ��ȡǰ�ɹ��ļ�¼
	static List<User> users;// ����û��ļ�¼
	private String cardNo = "";// ��¼����

	public static final String AC1 = "1234123456123490";
	public static final String AC2 = "1234123456123480";
	public static final String AC3 = "1234123456123430";

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
		withdrawMenu();// ȡ��������
		print();// ��ӡȡ���¼
		endMenu();// ����ѡ�����
	}

	private void endMenu() {
		String userSel = "";
		do {
			System.out.println("�Ƿ��������:(y|n)");
			userSel = in.next();
			if (userSel.equals("n")) {
				showRecord();
				mainMenu();
				break;
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
				record.add(money);
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

	// ��ʾȡ���¼
	private void print() {
		System.out.println("ȡ�����\t���");
		for (int i = 0; i < record.size(); i++) {
			System.out.println((i + 1) + "\t" + record.get(i));
		}
	}

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
		try {
			System.out.println("ȡ��ɹ������ջ�������п���ʣ����� "
					+ u.getAccount().getBalance());
			System.out.println("==============================");
			// �����־
			for (String str : u.getAccount().getLogs()) {
				System.out.println(str);
			}
		} catch (Exception e) {
			System.out.println("hello");
			System.out.println(e.getMessage());
		}
	}

	// ��֤����
	private boolean verifyPwd(int pwd) {
		boolean flag = false;
		String s = "";
		s = s.valueOf(pwd);
		try {
			User u = this.getCustomer(cardNo);
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
						System.out.println("���п�����ȷ��");// ����λ����ȷ���Ҵ��ڸ����п���
						break;
					} else {
						flag = false;
						throw new Exception("����" + cardNo + "�����ڣ�");
					}
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
