package com.lanqiao.date170418;

class SyncThread implements Runnable{
private int id;
	
	public SyncThread(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("�߳�ID��Ϊ��"+this.id+"���������"+i);
		}
	}
	
	
}
