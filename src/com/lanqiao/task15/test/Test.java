package com.lanqiao.task15.test;

import java.util.Random;


public class Test {
	public static void main(String[] args) {
		System.out.println("==================test1=================");
		test1();
		System.out.println("==================test2=================");
		test2();
		System.out.println("==================test3=================");
		test3();
		System.out.println("==================test4=================");
		test4();
		System.out.println("==================test5=================");
		test5();
		System.out.println("==================test6=================");
		test6();
	}
	
	/*������������Ϊ4�����飬��������洢������󣬵����ܴ洢�ظ��Ķ������ӡ�����ʾ
	ע�⣺0������	1���������	2�������è		3������Ұè*/
	public static void test6(){
		int count=0;
		Pet[] pets = new Pet[4];
		Random rd = new Random();
		while (true) {
			int num = rd.nextInt(4);
			if (pets[num] == null) {
				switch (num) {
				case 0:
					pets[0] = new Dog("С��",100,10,"��Ȯ");
					pets[0].print();
					count++;
					break;
				case 1:
					pets[1] = new Penguin("ŷŷ",200,0,"Q��");
					pets[1].print();
					count++;
					break;
				case 2:
					pets[2] = new HomeCat("С��è",80,80,"�ڰ�ɫ");
					pets[2].print();
					count++;
					break;
				case 3:
					pets[3] = new WildCat("СҰè",90,90,"��ɫ");
					pets[3].print();
					count++;
					break;
				default:
					break;
				}
			}
			if(count==pets.length){
				break;
			}
		}

	}
	
	
	/*�塢����������չManager�࣬��Manager��������ɸ�Oper�������ط��������ÿ�ֶ������ʾ*/
	public static void test5(){
		Manager m = new Manager();
		m.oper(new Dog("����",50,50,"�ҹ�"));
		m.oper(new Penguin("ŷŷ",60,60,"��"));
		m.oper(new Cat("Сè",70,70,"��ɫ"));
		m.oper(new HomeCat("С��è",80,80,"�ڰ�ɫ"));
		m.oper(new WildCat("СҰè",90,90,"��ɫ"));
	}
	
	
	/*�ġ�������������չ�������ࡰ��è��Ұè����Ȼ��������Ľ���*/
	public static void test4(){
		Pet p1 = new HomeCat("С��è",100,100,"�ڰ�ɫ");
		p1.print();
		
		p1 = new WildCat("СҰè",100,100,"��ɫ");
		p1.print();
	}
	
	
/*	�����ó���ʵ�ֿ���չ��1
	������������չһ�����ࡰè������������е�һ�����ԡ���ɫ����Ȼ��������Ľ���*/

	public static void test3(){
		Pet p1 = new Cat("Сè",100,100,"��ɫ");
		p1.print();
	}
	
	
/*	��:�ó��������Ϣ����Ի�
	��������:��һ�Ļ����ϣ���������������ͬ
			���ࣺ�����Ϣ������ȫ����Ϣ��
			�����������Ϣ�������Լ���Ʒ�֣�
			��죺�����Ϣ�������Լ����Ա�
			ע�⣺ʹ�÷�����дʵ��*/
	public static void test2(){
		Pet p1 = new Pet();//�������
		p1.print();//��ӡ�������ĸ������������ȫ����Ϣ
		
		//��̬������ת�ͣ���ͬ�������ͬһ������������ͬ�Ľ��
		Pet p = new Dog("����",100,0,"ѩ����");
		p.print();
		
		p = new Penguin("ŷŷ",200,0,"Q��");
		p.print();
	}
	
	
/*	һ:����������������Ϣ
	��������: Pet�����︸�ࣩ����Dog��Penguin�ģ�������name��������ֵ��health��
	�����ܶȣ�love�����Ժ�print�����ҽ��ܣ�����
	Dog�� Ʒ�֣�strain���ǵ���ӵ�е�
	Panguin���Ա�sex���ǵ���ӵ�е�
	�ֱ𴴽�һֻDog��PanguinȻ���ӡ�����ǵ���Ϣ*/
	public static void test1(){
		Pet p = new Dog("����",100,0,"�ҹ�");
		p.print();
		
		p = new Penguin("ŷŷ",200,0,"��");
		p.print();
	}
} 
