package com.lanqiao.date170421;

public class Producer extends Thread {

	Food food ;
	int count = 0;
	public Producer(String name, Food food) {
		super(name);
		this.food = food;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (food) {
				while (food.hasNext()) {
					//如果有一个商品，那么生产者等待产品消费。
					try {
						food.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				//通过计数生产不同的类型的产品
				if(count%2==0){
					food.setName("桂林米粉");
					food.setPrice(4.5);
				}else if(count%3==0){
					food.setName("三鲜粉");
					food.setPrice(6.0);
				}else{
					food.setName("螺蛳粉");
					food.setPrice(5.0);
				}
				
				System.out.println(this.getName() + "正在生产一个"
						+ food.toString());
				count++;
				
				food.setNext(true);
				food.notify();
			}
			
			//控制下次生产和消费同一个食品的时间
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
