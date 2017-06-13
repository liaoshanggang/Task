package com.lanqiao.date170416;

public class JoinThread {
	public static void main(String[] args) {
		SThread st = new SThread();
		QThread qt = new QThread(st);
		qt.start();
		st.start();
		
	}
}
