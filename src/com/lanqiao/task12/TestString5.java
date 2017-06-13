package com.lanqiao.task12;

import java.util.Scanner;

/*5、给定一个email地址，判断其是否正确，为了简单，现在只以判断@和.为主要操作：
例：a@a.c； 
@必须在.之前；
*/
public class TestString5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你的地址：");
		String email = in.next();
		if(email.indexOf("@")!=-1&&email.indexOf(".")>email.indexOf("@")){
			System.out.println("邮箱地址格式正确！");
		}else{
			System.out.println("邮箱地址格式不正确！");
		}
		
	}
}
