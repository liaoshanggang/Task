package com.lanqiao.date170416;

public class QThread extends Thread {
	int i = 0;
	Thread t = null;

	// ���췽��������һ���̶߳���
	public QThread(Thread t) {
		super("QThread�߳�");
		this.t = t;
	}

	@Override
	public void run() {
		try {
			while (i < 100) {
				if (i != 5) {
					Thread.sleep(500);
					System.out.println("QThread����ÿ��0.5��������֣�" + i++);
				} else {
					t.join();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
