package com.lanqiao.date170418;

public class TestSyncThread {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new SyncThread(i)).start();;
		}
	}
	
}
