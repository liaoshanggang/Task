package com.lanqiao.date170411.atm5;

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

/**
 * @Description: ϵͳ������
 * @author ���и�
 * @date 2017��4��11�� ����12:18:30
 * @version V1.0
 */
public class Manager {
	static Scanner in = new Scanner(System.in);
	private String cardNo = "";// ��¼����

	UserDao userDao = null;
	LogsDao logsDao = null;
	
	{		
		userDao = UserDao.getUserDao();
	}
	public Manager() {
	}

	public void mainMenu() {
		userDao.readUserInfo();
		System.out.println("==========��ӭ����ATM==========");
		cardInputMenu();// �����������
		passwordInputMenu();// �����������
		buzMenu();// ATM��ҵ�����
	}

	private void buzMenu() {

		while (true) {
			System.out.println("==========ATMҵ��ҳ��==========");
			System.out.println("1.ȡ��\t2.���\t3.��ѯ��¼");
			System.out.println("4.��ӡƾ��\t0.�˳�ϵͳ");
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
				depositMenu();// ������
				break;
			case 3:
				readFileLogs();// ��ʾ���д�ȡ���¼����
				break;
			case 4:
				print();// ��ӡ��ǰ�û���������ȡ���¼
				break;
			default:
				System.out.println("��ģ��δʵ�֣�");
				break;
			}
		}

	}

	// �û��´ε�¼ʱ��ѡ���ѯ�����ڿ���̨��ʾ֮ǰ��ȡ����Ϣ
	private void readFileLogs() {
		logsDao = LogsDao.getLogsDao();

		logsDao.readLogs();//�þ���ÿ�ΰ��ռǴ��ļ���ȡ�����浽�ڴ��У����ܿ��ܲ��ã�����ʵ�ָ��¼�¼��

		System.out.println("==========����Աר�ù��ܣ���ʾ�����û����д�ȡ���¼����==========");
		logsDao.showTradeLogs();

		System.out.println("========��ͨ�û�ר�ù��ܣ���ʾ��ǰ�˺Ž��׵����н�����Ϣ========");
		StringBuffer s = logsDao.getTradeLogById(cardNo);
		System.out.println(s);
	}

	private void print() {
		System.out.println("==========��ӡƾ������==========");
		System.out.println("��ģ��δʵ�֣�");
	}

	private void endMenu() {
		System.out.println("==========��������==========");
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

	private void depositMenu() {
		System.out.println("==========������==========");
		System.out.println("��ģ��δʵ�֣�");
	}

	private void withdrawMenu() {
		System.out.println("==========ȡ�����==========");

		int money;
		String userSel = "";
		do {
			System.out.println("����������ȡ������");
			money = in.nextInt();
			if (verifyMoney(money)) {
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

	// ��֤ȡǮ��
	private boolean verifyMoney(int money) {
		User u = userDao.getUser(cardNo);
		boolean flag = false;
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

	// ��֤����
	private boolean verifyPwd(int pwd) {
		boolean flag = false;
		String s = "";
		s = String.valueOf(pwd);

		try {
			if (s.length() != 6) {// ��֤���볤��
				flag = false;
				throw new Exception("���볤�Ȳ�����");
			} else {
				if (userDao.getPwd(cardNo).equals(s)) {
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
				if (userDao.getId(cardNo) != "") {
					flag = true;
					System.out.println("���п�����ȷ��");// ����λ����ȷ���Ҵ��ڸ����п���
				} else {
					flag = false;
					throw new Exception("����" + cardNo + "�����ڣ�");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return flag;
	}

	// ��ʾʣ������¼
	public void showRecord() {
		User u = userDao.getUser(cardNo);
		System.out.println("���ν��׳ɹ������ջ�������п���ʣ����� "
				+ u.getAccount().getBalance());
		System.out.println();
	}
}
