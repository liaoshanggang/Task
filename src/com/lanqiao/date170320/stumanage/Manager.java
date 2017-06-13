package com.lanqiao.date170320.stumanage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Manager {
	ArrayList stu = new ArrayList();

	// ѧ���ɼ�¼�뷽��,����stusΪ��¼����Ϣѧ������
	public void input(Student stus) {
		stu.add(stus);
		System.out.println("��ӳɹ���");
	}

	/*ѧ���ɼ��޸ķ���,����indexΪ�޸ĵ�ѧ����Ϣ����,
	 * ���Ȿ���������޸�ǰ��ʾ��ѧ����Ϣ
	 */
	public void update(int index) {
		Scanner in = new Scanner(System.in);
		Object o = stu.get(index);
		Student s = (Student) o;
		System.out.println("���\t����\t�γ�1\t�γ�2\t�γ�3\t");
		System.out.print(index+"\t"+s.getName()+"\t");
		for (int j = 0; j < s.getScore().length; j++) {
			System.out.print(s.getScore()[j]+"\t");
		}
		System.out.println("\n�������µ����ݣ�");
		System.out.print("������");
		String name = in.next();
		System.out.println("���������Ź��εĳɼ���");
		double[] score = new double[3];
		for (int j = 0; j < score.length; j++) {
			score[j] = in.nextDouble();
		}
		Student st = new Student(name, score);
		stu.remove(index);
		stu.add(index,st);
		System.out.println("�޸ĳɹ���");
	}
	
	//��ʾ����ѧ���ɼ���Ϣ����
	public void display(){
		System.out.println("���\t����\t�γ�1\t�γ�2\t�γ�3\t");
		for(int i=0;i<stu.size();i++){
			Object o = stu.get(i);
			if(o instanceof Student){
				Student s = (Student) o;
				System.out.print(i+"\t"+s.getName()+"\t");
				for (int j = 0; j < s.getScore().length; j++) {
					System.out.print(s.getScore()[i]+"\t");
				}
				System.out.println();
			}
		}
	}
	
	public void searchById(int id){
		System.out.println("���\t����\t�γ�1\t�γ�2\t�γ�3\t");
		Object o = stu.get(id);
		int i = stu.indexOf(o);
		Student s = (Student) o;
		System.out.println(i+"\t"+s.getName()+"\t"+s.getScore()[0]+s.getScore()[1]+s.getScore()[2]);
	}
	public void searchByName(String name){
		for (Object object : stu) {
			Student s = (Student) object;
			if(s.getName().equals(name)){
				System.out.println("���\t����\t�γ�1\t�γ�2\t�γ�3\t");
				System.out.print(stu.indexOf(object)+"\t"+s.getName()+"\t");
				for (int j = 0; j < s.getScore().length; j++) {
					System.out.print(s.getScore()[j]+"\t");
				}
				System.out.println();
			}
		}
		
	}
	
	// ��������ɾ���ڼ�����ɾ��ѧ���ķ���
	public void delete(int index){
		stu.remove(index);
		System.out.println("ɾ���ɹ���");
	}
	
	//��������ɾ���ڼ�����ɾ��ѧ���ķ���
	public void delete(String name){
		
		int i = 0;
		for (Object o : stu) {
			if(o instanceof Student){
				Student s = (Student) o;
				if(s.getName().equals(name)){
					i = stu.indexOf(o);
					//stu.remove(o);//java.util.ConcurrentModificationException
				}
			}
		}
		stu.remove(i);
		System.out.println("��������ɾ���ɹ���");
		System.out.println("ɾ���ɹ���");
	}

}
