package com.lanqiao.date170421;

import java.util.ArrayList;
import java.util.List;

public class TestProdCons {
	private static final List<Integer> hotDogs = new ArrayList<>();//存热狗
	
	public static void main(String[] args) {
		//3个生产者线程
		for (int i = 1; i <= 3; i++) {
			new Producer(i).start();
		}
		//5个消费者线程
		for (int i = 1; i <= 5; i++) {
			new Consumer(i).start();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
	
	private static class Producer extends Thread{
		int i = 1;//记录热狗数数量
		int pid = -1;
		
		public Producer(int pid) {
			this.pid = pid;
		}

		@Override
		public void run() {
			while(true){
				try {
					//模拟消耗时间
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (hotDogs){
					if(i<10){
						hotDogs.add(pid*10000+i);
						System.out.println("第"+this.pid+"个生产者正在生产一个热狗，编号为："+(pid*10000+i));
						i++;
						hotDogs.notifyAll();
					}else{
						System.out.println("热狗数已经10个，等待消费！");
						try {
							hotDogs.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
	
	private static class Consumer extends Thread{
		int cid = 1;
		
		public Consumer(int cid) {
			this.cid = cid;
		}

		@Override
		public void run() {
			while(true){
				//模拟消耗时间
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (hotDogs) {
					if(hotDogs.size()>0){
						System.out.println("消费者"+this.cid+"正在消费一个热狗，其编号为："+hotDogs.remove(0));
						hotDogs.notifyAll();
					}else{
						try {
							System.out.println("已经没有热狗了，等待生产！");
							hotDogs.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		
	}
	

}
