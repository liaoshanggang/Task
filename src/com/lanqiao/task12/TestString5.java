package com.lanqiao.task12;

import java.util.Scanner;

/*5������һ��email��ַ���ж����Ƿ���ȷ��Ϊ�˼򵥣�����ֻ���ж�@��.Ϊ��Ҫ������
����a@a.c�� 
@������.֮ǰ��
*/
public class TestString5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("��������ĵ�ַ��");
		String email = in.next();
		if(email.indexOf("@")!=-1&&email.indexOf(".")>email.indexOf("@")){
			System.out.println("�����ַ��ʽ��ȷ��");
		}else{
			System.out.println("�����ַ��ʽ����ȷ��");
		}
		
	}
}
