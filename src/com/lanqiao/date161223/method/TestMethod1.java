package com.lanqiao.date161223.method;
public class TestMethod1 {
	public static void main(String[] args) {
		Pig pig1 = new Pig();
		System.out.println(pig1);
		pig1.category = "Ұ��";
		pig1.color = "��";
		pig1.attact = 100;
		System.out.println(pig1);
		pig1.attack();
		pig1.eat();
		System.out.println("Ʒ�֣�"+pig1.getCategory());
		System.out.println("��ɫ"+pig1.getColor());
		
	}
}
