package com.lanqiao.date170320.test7;

import java.util.ArrayList;
import java.util.List;

/*（七）使用ArrayList类生成一个集合对象，向此集合对象中加入“一只羊”，“一头牛”，
 一个整数包装对象1，一个小数包装对象5.8，再加入一个“人”。然后循环输出这些对象的值。
 */
public class Test {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("一只羊");
		list.add("一头牛");
		list.add(new Integer(1));
		list.add(new Double(5.8));
		list.add("人");
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
