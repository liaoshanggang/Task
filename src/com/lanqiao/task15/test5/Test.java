package com.lanqiao.task15.test5;

//�ó��������Ϣ����Ի�
public class Test {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.oper(new Dog("����",50,50,"�ҹ�"));
		m.oper(new Penguin("ŷŷ",60,60,"��"));
		m.oper(new Cat("Сè",70,70,"��ɫ"));
		m.oper(new HomeCat("С��è",80,80,"�ڰ�ɫ"));
		m.oper(new WildCat("СҰè",90,90,"��ɫ"));
	}
} 
