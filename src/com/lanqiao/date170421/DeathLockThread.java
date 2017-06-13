package com.lanqiao.date170421;

public class DeathLockThread {
	public static Object lock1 = new Object(); 
	public static Object lock2 = new Object();
	
	public static void main(String[] args) {
		new Thread(new ShareThread1()).start();
		new Thread(new ShareThread2()).start();
	}
	
	private static class ShareThread1 implements Runnable{

		@Override
		public void run() {
			synchronized (lock1) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("ShareThread1有lock1中需要lock2才能继续");
				synchronized (lock2) {
					System.out.println("ShareThread1");
				}
			}
		}
		
	}
	
	private static class ShareThread2 implements Runnable{

		@Override
		public void run() {
			synchronized (lock2) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("ShareThread2有lock2中需要lock1才能继续");
				synchronized (lock1) {
					System.out.println("ShareThread2");
				}
			}
		}
		
	}
}
