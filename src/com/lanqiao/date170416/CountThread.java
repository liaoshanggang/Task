package com.lanqiao.date170416;

/*
 * �����ڲ���һ����������,ÿ��2�����1��2��3...ֱ��100������
 * ���󣺵��û�����ֹ�����������ʱ��ֻҪ�ڿ���̨����s����
 * */
public class CountThread extends Thread {
	private int i = 0;

	public CountThread() {
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
				Thread.sleep(2000);

			}
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
