package com.lanqiao.date170418;

class SyncThread implements Runnable{
private int id;
	
	public SyncThread(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("线程ID名为："+this.id+"正在输出："+i);
		}
	}
	
	
}
