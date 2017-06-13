package com.lanqiao.date170416;

public class InterruptThread {

	public static void main(String[] args) {
		CountThread1 ct1 = new CountThread1();
		ct1.start();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ct1.interrupt();
	}

}
