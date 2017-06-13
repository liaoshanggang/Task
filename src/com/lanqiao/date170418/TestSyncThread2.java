package com.lanqiao.date170418;
//一个线程输出完再允许另一个线程输出
public class TestSyncThread2 {

	public static void main(String[] args) {
		Object o = new Object();
		for (int i = 0; i < 5; i++) {
			new Thread(new SyncThread2(i,o)).start();;
		}
	}
	
}
