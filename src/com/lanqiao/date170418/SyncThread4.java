package com.lanqiao.date170418;

//ʹ�þ�̬ͬ�������������ֽ����ļ�
class SyncThread4 implements Runnable {
	private int id;

	public SyncThread4(int id) {
		this.id = id;
	}

	public static synchronized void doTask(int id){
		for (int i = 0; i < 10; i++) {
			System.out.println("�߳�ID��Ϊ��" + id + "���������" + i);
		}
	}
	
	@Override
	public void run() {
		doTask(this.id);
	}

}
