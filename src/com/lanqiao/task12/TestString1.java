package com.lanqiao.task12;
/*1����д���� ��jdk�� ȫ����Ϊ��д,���������Ļ,��ȡ�Ӵ���DK�� ���������Ļ */
public class TestString1 {
	public static void main(String[] args) {
		String str = "jdk";
		System.out.println("ԭ�ַ�����"+str);
		String str1 = str.toUpperCase();
		System.out.println("jdk��Ϊ��дΪ��"+str1);
		String str2 = str1.substring(1);
		System.out.println("��ȡ���Ӵ�Ϊ��"+str2);
	}
}
