package com.lanqiao.date170421;

public class Consumer extends Thread {

	Food food = null;

	public Consumer(String name, Food food) {
		super(name);
		this.food = food;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (food) {
				while (!food.hasNext()) {
					//如果没有产品，那么消费者等待产品生产， 
					try {
						food.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} 
				System.out.println(this.getName() + "正在消费一个"
						+ food.toString());
				
				food.setNext(false);
				food.notify();
					
			}
		}
	}
}
