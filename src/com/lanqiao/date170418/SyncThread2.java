package com.lanqiao.date170418;

class SyncThread2 implements Runnable{
	private int id;
	private Object lock;
	
	public SyncThread2(int id, Object lock) {
		this.id = id;
		this.lock = lock;
	}
	
	@Override
	public void run() {
		synchronized(lock){
			for (int i = 0; i < 10; i++) {
				System.out.println("�߳�ID��Ϊ��"+this.id+"���������"+i);
			}			
		}
	}
	
}
