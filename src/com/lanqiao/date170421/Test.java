package com.lanqiao.date170421;

public class Test {
	public static void main(String[] args) {
		Food food = new Food();
		Producer pd = new Producer("������", food);
		Consumer cons = new Consumer("������", food);
		pd.start();
		cons.start();
	}
}
