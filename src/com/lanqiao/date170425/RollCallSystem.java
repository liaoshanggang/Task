package com.lanqiao.date170425;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

public class RollCallSystem {
	public static void main(String[] args) {
		//文件路径
		String path = "D:\\WorkSpace\\Task\\src\\com\\lanqiao\\date170425\\name.properties";
		RollCallSystem rcs = new RollCallSystem();
		
		//1、获得随机数
		Random rd = new Random();
		String in = String.valueOf(rd.nextInt(30)+1);
		System.out.println("随机数："+in);//显示一个随机数
		
		//2、读取属性列表
		Properties p = rcs.initProperty(path);
		
		//3、从键集合中匹配这个随机数，如果匹配到则显示对应值
		Set<Object> set = p.keySet();
		for (Object object : set) {
			String str = (String) object;
			if (in.equals(str)) {
				System.out.println("点到的姓名："+p.getProperty(str));
			}
		}
	}
	
	/**
	 * @Description: 按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
	 * @param 文件路径
	 * @return Properties对象
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