package com.lanqiao.date170416;

import java.util.Scanner;

public class EndingThread {

	public static void main(String[] args) {
		CountThread ct = new CountThread();
		ct.start();

		Scanner in = new Scanner(System.in);
		System.out.println("�������ֹ����̣߳�������s");
		while (true) {
			String s = in.next();
			if (s.equals("s")) {
				ct.stopIt();
				break;
			}
		}

	}

}
