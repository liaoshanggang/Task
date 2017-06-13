package com.lanqiao.date170320.stumanage;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	Manager m = new Manager();
	int userSel;
	public void door() {
		String user;
		String pwd;
		System.out.println("======学生管理系统======");
		while (true) {
			System.out.println("\t登陆界面");
			System.out.println("请输入你的用户名：");
			user = sc.next();
			System.out.println("请输入你的密码：");
			pwd = sc.next();
			if (verify(user, pwd)) {
				mainMenu();
			} else {
				System.out.println("账号或密码错误！请重新输入");
			}
		}
	}

	private void mainMenu() {
		// TODO 自动生成的方法存根
		while (true) {
			System.out.println("=========主菜单===========");
			System.out.println("1.添加");
			System.out.println("2.显示");
			System.out.println("3.查询");
			System.out.println("4.修改");
			System.out.println("5.删除");
			System.out.println("6.退出");
			System.out.println("请选择：");
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
		// TODO 自动生成的方法存根
		System.out.println("退出系统成功！");
		System.exit(0);
	}

	private void deleteStuInfo() {
		System.out.println("您有2种方式删除学生：");
		System.out.println("1、根据学生编号删除学生：");
		System.out.println("2、根据学生姓名删除 学生：");
		System.out.println("请选择(1或2)：");
		int sel = sc.nextInt();
		if(sel==1){
			System.out.print("请输入学生编号：");
			int index = sc.nextInt();
			m.delete(index);
		}else{
			System.out.print("请输入学生姓名：");
			String name = sc.next();
			m.delete(name);
		}
		
	}

	private void setStuInfo() {
		// TODO 自动生成的方法存根
		System.out.println("请输入学生编号修改学生：");
		int index = sc.nextInt();
		m.update(index);
	}

	private void searchStuInfo() {
		// TODO 自动生成的方法存根
		System.out.println("您有2种方式查找学生：");
		System.out.println("1、根据学生编号查找学生：");
		System.out.println("2、根据学生姓名查找 学生：");
		System.out.println("请选择(1或2)：");
		int sel = sc.nextInt();
		if(sel==1){
			System.out.println("请输入要查找学生的编号：");
			int id = sc.nextInt();
			m.searchById(id);
		}else{
			System.out.println("请输入要查找学生的姓名：");
			String name = sc.next();
			m.searchByName(name);
		}
	}

	private void showStuInfo() {
		// TODO 自动生成的方法存根
		m.display();
	}

	private void addStuInfo() {
		// TODO 自动生成的方法存根
		while(true){
			System.out.print("请输入新同学的姓名：");
			String name = sc.next();
			System.out.println("请输入三门功课的成绩：");
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
		// TODO 自动生成的方法存根
		if (user.equals("manage") && pwd.equals("123456")) {
			System.out.println("登陆成功！");
			return true;
		}
		return false;
	}
}
