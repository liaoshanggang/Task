package com.lanqiao.date170416;

public class CountThread1 extends Thread {
	private int i = 0;

	public CountThread1() {
		super("�����߳�");
	}

	// ͨ������i=100�����߳���ֹ
	public void stopIt() {
		i = 100;
	}

	public void run() {
		try {
			while (i < 100) {
				System.out.println("this.getName()" + "����:" + (i + 1));
				i++;
				Thread.sleep(5000);

			}
		} catch (InterruptedException e) {
			System.out.println("���򲶻���InterruptedException�쳣��");
		}
		System.out.println("�����߳�������1�Σ�");
	}
}
