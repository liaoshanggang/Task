package com.lanqiao.date170418;
//�߳����ڲ�����һ����̬������Դ
class SyncThread3 implements Runnable{
	private int id;
	private static Object lock = new Object();
	
	public SyncThread3(int id) {
		this.id = id;
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
