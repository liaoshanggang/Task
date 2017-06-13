package com.lanqiao.task13.test1;
/*
创建一只Tank对象，调用其方法；创建一只Bullen，调用其方法*/
public class Test {
	public static void main(String[] args) {
		Tank tank1 = new Tank("上",100,110);
		tank1.attack();
		Bullen bullen = new Bullen("机枪子弹",200,50);
		bullen.attack();
	}
}
