package com.lanqiao.date170320.stumanage;

import java.util.Scanner;

/*�����û������N��ѧ���͸������Ź��γɼ�����Ϣ
�����ṩά���ɼ�,��ʾȫ��ѧ���ɼ���Ϣ�Ĺ���
*/
public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Manager m = new Manager();
		System.out.print("������ѧ��������");
		int num = in.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.print("�������"+(i+1)+"��ѧ��������");
			String name = in.next();
			System.out.println("���������Ź��εĳɼ���");
			double[] score = new double[3];
			for (int j = 0; j < score.length; j++) {
				score[j] = in.nextDouble();
			}
			Student stu = new Student(name, score);
			m.input(stu);
		}
		m.display();
		System.out.println("1.�޸�ѧ��");
		System.out.println("2.�˳�");
		System.out.print("��ѡ��ִ�еĲ�����");
		String sel = in.next();
		if(sel.equals("1")){
			System.out.println("������Ҫ�޸�ѧ���ı�ţ�");
			int index = in.nextInt();
			m.update(index);
			m.display();
		}else{
			System.exit(0);
		}
		
		
	}
}
