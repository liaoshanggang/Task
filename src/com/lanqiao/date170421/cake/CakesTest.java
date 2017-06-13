package com.lanqiao.date170421.cake;

/*
 * 需求：生产消费者案例，生产山东大煎饼，每次生产一个，消费一个，
 * 如果没人买，那就等着，如果有人买，但是买生产，消费者等着
 * 
 * 1. 测试类
 * 2. 生产者类
 * 3. 消费者类
 * 4. 大煎饼类
 */
public class CakesTest {

	public static void main(String[] args) {
		
		Cakes cakes = new Cakes();
		
		Thread pt = new Thread(new ProducterCakes(cakes),"山东大爷");
		Thread ct = new Thread(new ConsumeCakes(cakes),"菇凉");
		
		pt.start();
		ct.start();
		
	}

}
