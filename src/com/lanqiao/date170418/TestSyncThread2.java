package com.lanqiao.date170418;
//һ���߳��������������һ���߳����
public class TestSyncThread2 {

	public static void main(String[] args) {
		Object o = new Object();
		for (int i = 0; i < 5; i++) {
			new Thread(new SyncThread2(i,o)).start();;
		}
	}
	
}
