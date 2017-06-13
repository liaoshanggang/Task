package com.lanqiao.task12;
/*1、编写程序将 “jdk” 全部变为大写,并输出到屏幕,截取子串”DK” 并输出到屏幕 */
public class TestString1 {
	public static void main(String[] args) {
		String str = "jdk";
		System.out.println("原字符串："+str);
		String str1 = str.toUpperCase();
		System.out.println("jdk变为大写为："+str1);
		String str2 = str1.substring(1);
		System.out.println("截取的子串为："+str2);
	}
}
