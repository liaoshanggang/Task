package com.lanqiao.date170425;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

public class RollCallSystem {
	public static void main(String[] args) {
		//�ļ�·��
		String path = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170425\\name.properties";
		RollCallSystem rcs = new RollCallSystem();
		
		//1����������
		Random rd = new Random();
		String in = String.valueOf(rd.nextInt(30)+1);
		System.out.println("�������"+in);//��ʾһ�������
		
		//2����ȡ�����б�
		Properties p = rcs.initProperty(path);
		
		//3���Ӽ�������ƥ���������������ƥ�䵽����ʾ��Ӧֵ
		Set<Object> set = p.keySet();
		for (Object object : set) {
			String str = (String) object;
			if (in.equals(str)) {
				System.out.println("�㵽��������"+p.getProperty(str));
			}
		}
	}
	
	/**
	 * @Description: ���򵥵������еĸ�ʽ�������ַ����ж�ȡ�����б�����Ԫ�ضԣ���
	 * @param �ļ�·��
	 * @return Properties����
	 */
	private Properties initProperty(String path) {
		Properties p = new Properties();
		try {
			p.load(new FileReader(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p;
	}
}