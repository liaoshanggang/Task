package com.lanqiao.date170320.test9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*��дһ�������࣬main������һ��ArrayList��Ķ����ô˶��������ѧ������
 * Ҫ��ʹ��ѭ������ѧ���ı�ţ�����ѧ��������������ѧ�����Ա�����ѧ���ĳɼ���Ȼ������һ��ѧ�����󣬷��뵽���϶�����ȥ��
 * Ȼ�����Ƿ�Ҫ��������ѧ����Ϣ������ش��ǡ�y������ַ�����ô��������һ��ѧ������Ϣ���������ѭ��������������ѧ������Ϣ��*/
public class Test {
	public static void main(String[] args) throws IOException {
		List list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		Student[] stus = new Student[100];
		String sel = "";
		int i = 0;
		do {
			System.out.println("������ѧ����Ϣ��");
			System.out.print("��ţ�");
			int num = sc.nextInt();
			System.out.print("������");
			String name = sc.next();
			System.out.print("�Ա�(ֻ���л�Ů)��");
			char[] sex = sc.next().toCharArray();
			System.out.print("�ɼ���");
			double score = sc.nextDouble();
			stus[i] = new Student(num, name, sex[0], score);
			list.add(stus[i]);
			System.out.println("�Ƿ�Ҫ��������ѧ����Ϣ��");
			sel = sc.next();
			i++;
		} while (sel.equals("y"));

		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}
	}
}
