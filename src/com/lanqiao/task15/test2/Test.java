package com.lanqiao.task15.test2;
//�ó��������Ϣ����Ի�
public class Test {
	public static void main(String[] args) {
		Pet p1 = new Pet();//�������
		p1.print();//��ӡ�������ĸ������������ȫ����Ϣ
		
		//��̬������ת�ͣ���ͬ�������ͬһ������������ͬ�Ľ��
		Pet p = new Dog("����",100,0,"ѩ����");
		p.print();
		p = new Penguin("ŷŷ",200,0,"Q��");
		p.print();
	}
} 
