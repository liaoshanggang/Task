package com.lanqiao.date170407.atm3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Class {
	private List<String> logs;// ȡ����־
	public static void main(String[] args) {
		System.out.println(currentTime());
	}
	public static String currentTime() {
		long ct = System.currentTimeMillis();
		Date d = new Date(ct);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:ss:mm");
		return sdf.format(d);
	}
	public String showLog() {

		StringBuffer sbf = new StringBuffer();

		for (String str : logs) {
			sbf.append(str);
		}

		return sbf.toString();
	}

}
