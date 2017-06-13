package com.lanqiao.date170320.stumanage;

import java.util.Scanner;

/*接收用户输入的N个学生和各自三门功课成绩的信息
并且提供维护成绩,显示全部学生成绩信息的功能
*/
public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Manager m = new Manager();
		System.out.print("请输入学生人数：");
		int num = in.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.print("请输入第"+(i+1)+"名学生姓名：");
			String name = in.next();
			System.out.println("请输入三门功课的成绩：");
			double[] score = new double[3];
			for (int j = 0; j < score.length; j++) {
				score[j] = in.nextDouble();
			}
			Student stu = new Student(name, score);
			m.input(stu);
		}
		m.display();
		System.out.println("1.修改学生");
		System.out.println("2.退出");
		System.out.print("请选择执行的操作：");
		String sel = in.next();
		if(sel.equals("1")){
			System.out.println("请输入要修改学生的编号：");
			int index = in.nextInt();
			m.update(index);
			m.display();
		}else{
			System.exit(0);
		}
		
		
	}
}
