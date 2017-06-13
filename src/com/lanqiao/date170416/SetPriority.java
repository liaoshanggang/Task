package com.lanqiao.date170416;

public class SetPriority {

	public static void main(String[] args) {
		QThread1 qt1 = new QThread1();
		SThread1 st1 = new SThread1();
		
		qt1.setPriority(Thread.MIN_PRIORITY);
		st1.setPriority(Thread.MAX_PRIORITY);
		qt1.start();
		st1.start();
	}

}
