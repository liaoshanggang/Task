package com.lanqiao.date170418;

public class TestSyncThread3 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new SyncThread3(i)).start();;
		}
	}
	
}
