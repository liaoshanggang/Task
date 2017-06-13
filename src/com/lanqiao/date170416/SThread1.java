package com.lanqiao.date170416;

public class SThread1 extends Thread {
	int i = 0;

	@Override
	public void run() {
		while (i < 100) {
			System.out.println("SThread1正在输出文字：" + i++);
		}
	}
}
