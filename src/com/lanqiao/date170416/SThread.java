package com.lanqiao.date170416;

public class SThread extends Thread {
	int i = 0;

	@Override
	public void run() {
		try {
			while (i < 100) {
				Thread.sleep(1000);
				System.out.println("SThread����ÿ��1��������֣�" + i++);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
