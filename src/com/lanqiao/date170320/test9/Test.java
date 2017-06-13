package com.lanqiao.date170320.test9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*再写一个测试类，main中生成一个ArrayList类的对象，用此对象放入多个学生对象。
 * 要求：使用循环输入学生的编号，输入学生的姓名，输入学生的性别，输入学生的成绩，然后生成一个学生对象，放入到集合对象中去。
 * 然后问是否还要继续输入学生信息，如果回答是‘y’这个字符，那么就再输入一个学生的信息，否则结束循环。最后输出所有学生的信息。*/
public class Test {
	public static void main(String[] args) throws IOException {
		List list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		Student[] stus = new Student[100];
		String sel = "";
		int i = 0;
		do {
			System.out.println("请输入学生信息：");
			System.out.print("编号：");
			int num = sc.nextInt();
			System.out.print("姓名：");
			String name = sc.next();
			System.out.print("性别(只能男或女)：");
			char[] sex = sc.next().toCharArray();
			System.out.print("成绩：");
			double score = sc.nextDouble();
			stus[i] = new Student(num, name, sex[0], score);
			list.add(stus[i]);
			System.out.println("是否还要继续输入学生信息：");
			sel = sc.next();
			i++;
		} while (sel.equals("y"));

		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}
	}
}
