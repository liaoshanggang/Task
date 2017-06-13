package com.lanqiao.task12;
/*2、编写程序将String类型字符串”test” 变为 “tset”. 
*/
public class TestString2 {
	public static void main(String[] args) {
		String str = "test";
		System.out.println("原字符串："+str);
		String str2 = str.replace("es", "se");
		System.out.println("变换后："+str2);
	
		
	}
}
