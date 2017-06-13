package com.lanqiao.date170418;

public class ShareData {
	static int data = 0;
	public static void main(String[] args) {
		ShareThread1 st1 = new ShareThread1();
		ShareThread2 st2 = new ShareThread2();
		new Thread(st1).start();
		new Thread(st2).start();
	}
	
	private static class ShareThread1 implements Runnable {

		@Override
		public void run() {
			while(data<10){
				try {
					Thread.sleep(1000);
					System.out.println("这个小于10的数据是："+data++);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
	
	private static class ShareThread2 implements Runnable {

		@Override
		public void run() {
			while(data<100){
				data++;
			}
		}

	}
}
