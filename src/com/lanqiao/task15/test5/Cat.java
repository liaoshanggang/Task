package com.lanqiao.task15.test5;
//������������չһ�����ࡰè������������е�һ�����ԡ���ɫ����Ȼ��������Ľ���
public class Cat extends Pet{
	private String color;//��ɫ
	
	//è����޲ι��췽��
	public Cat() {
		
	}

	//è����вι��췽����ʼ��
	public Cat(String name, int health, int love,String color) {
		super(name, health, love);
		this.color = color;
	}

	//���ҽ���
	public void print() {
		super.print();
		System.out.println("��ɫ�ǣ�"+this.color);
	}
	
	
}
