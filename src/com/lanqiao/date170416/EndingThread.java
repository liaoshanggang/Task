package com.lanqiao.date170416;

import java.util.Scanner;

public class EndingThread {

	public static void main(String[] args) {
		CountThread ct = new CountThread();
		ct.start();

		Scanner in = new Scanner(System.in);
		System.out.println("如果想终止输出线程，请输入s");
		while (true) {
			String s = in.next();
			if (s.equals("s")) {
				ct.stopIt();
				break;
			}
		}

	}

}
