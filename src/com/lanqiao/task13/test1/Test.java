package com.lanqiao.task13.test1;
/*
����һֻTank���󣬵����䷽��������һֻBullen�������䷽��*/
public class Test {
	public static void main(String[] args) {
		Tank tank1 = new Tank("��",100,110);
		tank1.attack();
		Bullen bullen = new Bullen("��ǹ�ӵ�",200,50);
		bullen.attack();
	}
}
