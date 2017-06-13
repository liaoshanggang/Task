package com.lanqiao.date170416;

public class QThread extends Thread {
	int i = 0;
	Thread t = null;

	// 构造方法，传入一个线程对象
	public QThread(Thread t) {
		super("QThread线程");
		this.t = t;
	}

	@Override
	public void run() {
		try {
			while (i < 100) {
				if (i != 5) {
					Thread.sleep(500);
					System.out.println("QThread正在每隔0.5秒输出数字：" + i++);
				} else {
					t.join();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
