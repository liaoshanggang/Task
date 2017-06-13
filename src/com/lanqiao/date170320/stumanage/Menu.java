package com.lanqiao.date170320.stumanage;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	Manager m = new Manager();
	int userSel;
	public void door() {
		String user;
		String pwd;
		System.out.println("======ѧ������ϵͳ======");
		while (true) {
			System.out.println("\t��½����");
			System.out.println("����������û�����");
			user = sc.next();
			System.out.println("������������룺");
			pwd = sc.next();
			if (verify(user, pwd)) {
				mainMenu();
			} else {
				System.out.println("�˺Ż������������������");
			}
		}
	}

	private void mainMenu() {
		// TODO �Զ����ɵķ������
		while (true) {
			System.out.println("=========���˵�===========");
			System.out.println("1.���");
			System.out.println("2.��ʾ");
			System.out.println("3.��ѯ");
			System.out.println("4.�޸�");
			System.out.println("5.ɾ��");
			System.out.println("6.�˳�");
			System.out.println("��ѡ��");
			userSel = sc.nextInt();
			switch (userSel) {
			case 1:
				addStuInfo();
				break;
			case 2:
				showStuInfo();
				break;
			case 3:
				searchStuInfo();
				break;
			case 4:
				setStuInfo();
				break;
			case 5:
				deleteStuInfo();
				break;
			case 6:
				exit();
				break;
			default:
				break;
			}
		}

	}

	private void exit() {
		// TODO �Զ����ɵķ������
		System.out.println("�˳�ϵͳ�ɹ���");
		System.exit(0);
	}

	private void deleteStuInfo() {
		System.out.println("����2�ַ�ʽɾ��ѧ����");
		System.out.println("1������ѧ�����ɾ��ѧ����");
		System.out.println("2������ѧ������ɾ�� ѧ����");
		System.out.println("��ѡ��(1��2)��");
		int sel = sc.nextInt();
		if(sel==1){
			System.out.print("������ѧ����ţ�");
			int index = sc.nextInt();
			m.delete(index);
		}else{
			System.out.print("������ѧ��������");
			String name = sc.next();
			m.delete(name);
		}
		
	}

	private void setStuInfo() {
		// TODO �Զ����ɵķ������
		System.out.println("������ѧ������޸�ѧ����");
		int index = sc.nextInt();
		m.update(index);
	}

	private void searchStuInfo() {
		// TODO �Զ����ɵķ������
		System.out.println("����2�ַ�ʽ����ѧ����");
		System.out.println("1������ѧ����Ų���ѧ����");
		System.out.println("2������ѧ���������� ѧ����");
		System.out.println("��ѡ��(1��2)��");
		int sel = sc.nextInt();
		if(sel==1){
			System.out.println("������Ҫ����ѧ���ı�ţ�");
			int id = sc.nextInt();
			m.searchById(id);
		}else{
			System.out.println("������Ҫ����ѧ����������");
			String name = sc.next();
			m.searchByName(name);
		}
	}

	private void showStuInfo() {
		// TODO �Զ����ɵķ������
		m.display();
	}

	private void addStuInfo() {
		// TODO �Զ����ɵķ������
		while(true){
			System.out.print("��������ͬѧ��������");
			String name = sc.next();
			System.out.println("���������Ź��εĳɼ���");
			double[] score = new double[3];
			for (int j = 0; j < score.length; j++) {
				score[j] = sc.nextDouble();
			}
			Student stu = new Student(name, score);
			m.input(stu);
			mainMenu();
		}
	}

	private boolean verify(String user, String pwd) {
		// TODO �Զ����ɵķ������
		if (user.equals("manage") && pwd.equals("123456")) {
			System.out.println("��½�ɹ���");
			return true;
		}
		return false;
	}
}
