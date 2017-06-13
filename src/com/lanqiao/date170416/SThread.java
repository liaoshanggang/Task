package com.lanqiao.date170416;

public class SThread extends Thread {
	int i = 0;

	@Override
	public void run() {
		try {
			while (i < 100) {
				Thread.sleep(1000);
				System.out.println("SThread正在每隔1秒输出数字：" + i++);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
