package com.lanqiao.date170418;

//使用静态同步方法，对象字节码文件
class SyncThread4 implements Runnable {
	private int id;

	public SyncThread4(int id) {
		this.id = id;
	}

	public static synchronized void doTask(int id){
		for (int i = 0; i < 10; i++) {
			System.out.println("线程ID名为：" + id + "正在输出：" + i);
		}
	}
	
	@Override
	public void run() {
		doTask(this.id);
	}

}
