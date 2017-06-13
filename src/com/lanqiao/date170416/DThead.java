package com.lanqiao.date170416;

public class DThead extends Thread {
	public DThead() {
		setDaemon(true);
	}
	
	@Override
	public void run() {
		while(true){
			System.out.println("我是后台线程！");
		}
	}
}
