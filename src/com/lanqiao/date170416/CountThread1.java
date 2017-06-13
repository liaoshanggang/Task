package com.lanqiao.date170416;

public class CountThread1 extends Thread {
	private int i = 0;

	public CountThread1() {
		super("计数线程");
	}

	// 通过设置i=100，让线程终止
	public void stopIt() {
		i = 100;
	}

	public void run() {
		try {
			while (i < 100) {
				System.out.println("this.getName()" + "计数:" + (i + 1));
				i++;
				Thread.sleep(5000);

			}
		} catch (InterruptedException e) {
			System.out.println("程序捕获了InterruptedException异常！");
		}
		System.out.println("计数线程运行了1次！");
	}
}
