package com.lanqiao.date170323.atm1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * 
����2�� ATM
��ʼҪ�󣺿�Ĭ��100000
¼�룺���п��ţ�ȡ����Ǯ������
�쳣��������Ų��� 1234-123456-1234AB
      Ǯ����100 - 30000
	  ���룺6
��ӡ��������ǰȡ����
          ��ʣ����
		  -----------
		  ȡ�����  ���
		  1         150.00
		  2         1000.00
 * @author gg
 *
 */
//������
public class Manager {
	static Scanner in = new Scanner(System.in);
	List record = new ArrayList();// ��¼ÿ��ȡǰ�ɹ��ļ�¼
	List users = new ArrayList();// ����û��ļ�¼
	private String cardNo = "";// ��¼����

	public Manager() {
	}

	public void mainMenu() {
		System.out.println("===��ӭ����ATM===");
		cardInputMenu();// �����������
		passwordInputMenu();// �����������
		withdrawMenu();// ȡ��������
		print();// ��ӡȡ���¼
		endMenu();//����ѡ�����
	}

	private void endMenu() {
		String userSel = "";
		do {
			System.out.println("�Ƿ��������:(y|n)");
			userSel = in.next();
			if (userSel.equals("n")) {
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
		boolean flag = false;
		User u = this.getCustomer(cardNo);
		try {
			if (money < 100 || money > 30000) {// ��֤ȡǮ���
				flag = false;
				throw new MoneyException("ȡǮ��������");
			} else {
				if (money % 100 == 0) {
					u.getAccount().withdraw(money);
					flag = true;
				} else {
					throw new MoneyException("����ȡǮ����");
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

	// ��֤����
	private boolean verifyPwd(int pwd) {
		boolean flag = false;
		String s = "";
		s = s.valueOf(pwd);
		try {
			User u = this.getCustomer(cardNo);
			if (s.length() != 6) {// ��֤���볤��
				flag = false;
				throw new PasswordException("���볤�Ȳ�����");
			} else {
				if (u.getPwd() == pwd) {
					flag = true;// ����λ����ȷ���Ҵ��ڸ����п���
					System.out.println("������ȷ��");
				} else {
					flag = false;
					throw new PasswordException("���벻��ȷ��");
				}
			}
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	// ��֤����
	private boolean verifyCardNO(String cardNo) {
		boolean flag = false;
		try {
			if (cardNo.length() > 16) {// ��֤���ų���
				flag = false;
				throw new CardNoException("���ų��Ȳ�����");
			} else {
				for (Object object : users) {
					User u = (User) object;
					if (u.getAccount().getCardNo().equals(cardNo)) {
						flag = true;// ����λ����ȷ���Ҵ��ڸ����п���
						break;
					} else {
						flag = false;
					}
				}
				if (flag = true) {
					System.out.println("���п�����ȷ��");
				} else {
					throw new CardNoException("����" + cardNo + "�����ڣ�");
				}
			}
		} catch (CardNoException e) {
			System.out.println(e.toString());
		}
		return flag;
	}

	// ���ָ�����ֵ��û�
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

	// ����û�
	public void addCustomer(User u) {
		users.add(u);
	}

}
