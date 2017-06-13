package com.lanqiao.date170416;

/*
 * 程序内部有一个计数功能,每隔2秒输出1、2、3...直到100结束。
 * 需求：当用户想终止这个计数功能时，只要在控制台输入s即可
 * */
public class CountThread extends Thread {
	private int i = 0;

	public CountThread() {
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
				Thread.sleep(2000);

			}
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
