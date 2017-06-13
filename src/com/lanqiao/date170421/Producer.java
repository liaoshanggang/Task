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
					//�����һ����Ʒ����ô�����ߵȴ���Ʒ���ѡ�
					try {
						food.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				//ͨ������������ͬ�����͵Ĳ�Ʒ
				if(count%2==0){
					food.setName("�����׷�");
					food.setPrice(4.5);
				}else if(count%3==0){
					food.setName("���ʷ�");
					food.setPrice(6.0);
				}else{
					food.setName("���Ϸ�");
					food.setPrice(5.0);
				}
				
				System.out.println(this.getName() + "��������һ��"
						+ food.toString());
				count++;
				
				food.setNext(true);
				food.notify();
			}
			
			//�����´�����������ͬһ��ʳƷ��ʱ��
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
