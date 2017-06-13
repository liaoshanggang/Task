package com.lanqiao.date170421;

public class Test {
	public static void main(String[] args) {
		Food food = new Food();
		Producer pd = new Producer("生成者", food);
		Consumer cons = new Consumer("消费者", food);
		pd.start();
		cons.start();
	}
}
