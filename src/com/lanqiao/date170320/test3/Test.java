package com.lanqiao.date170320.test3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*（三）声明一个set集合，使用HashSet类，来保存十个字符串信息，然后通过这个集合，
 * 然后使用iterator()方法，得到一个迭代器，遍历所有的集合中所有的字符串；
 * 然后拿出所有的字符串拼接到一个StringBuffer对象中，然后输出它的长度和具体内容； 
 *  验证集合的remove()、size()、contains()、isEmpty()等*/
public class Test {

	public static void main(String[] args) {
		Set set = new HashSet();
		// 保存十个字符串信息
		for (int i = 0; i < 10; i++) {
			set.add("String" + i);
		}

		// 遍历输出这十个字符串并拼接
		StringBuffer sb = new StringBuffer();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println("字符串：" + obj);
			sb.append(obj);
		}
		System.out.println("拼接后：" + sb + "\n长度为：" + sb.length());

		// 验证集合的remove()、size()、contains()、isEmpty()
		System.out.println("删除String1" + ":" + set.remove("Stirng1"));
		System.out.println("the set size:" + set.size());
		System.out.println("the set iscontains \"String1\":"
				+ set.contains("String1"));
		System.out.println("the set isEmpty:" + set.isEmpty());

	}

}
