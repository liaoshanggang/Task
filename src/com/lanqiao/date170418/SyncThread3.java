package com.lanqiao.date170418;
//线程类内部定义一个静态共享资源
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
				System.out.println("线程ID名为："+this.id+"正在输出："+i);
			}			
		}
	}
	
}
