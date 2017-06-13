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
					//���û�в�Ʒ����ô�����ߵȴ���Ʒ������ 
					try {
						food.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} 
				System.out.println(this.getName() + "��������һ��"
						+ food.toString());
				
				food.setNext(false);
				food.notify();
					
			}
		}
	}
}
