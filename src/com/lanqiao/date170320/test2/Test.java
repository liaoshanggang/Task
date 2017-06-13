package com.lanqiao.date170320.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*（二）1、生成一个ArrayList集合，将集合中放入字符串“a”,"b","c",还有整数5,9。最后使用循环输出。
 2、生成一个Set集合，将1,2,3,4,5，这五个数字放入到集合中，最后使用迭代器将所有数据输出。
 */
public class Test {
	public static void main(String[] args) {
		// 1、生成一个ArrayList集合，将集合中放入字符串“a”,"b","c",还有整数5,9。最后使用循环输出。
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(5);
		list.add(9);

		for (Object object : list) {
			System.out.print(object + "\t");
		}
		System.out.println();

		// 2、生成一个Set集合，将1,2,3,4,5，这五个数字放入到集合中，最后使用迭代器将所有数据输出。
		Set set = new HashSet();
		for (int i = 1; i <= 5; i++) {
			set.add(i);
		}
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();

		/*
		 * 写一个测试类，在main方法中生成三个学生对象，再生成一个Map对象，将这三个学生放入到Map中，要求key为学生的姓名，
		 * value为学生对象。最后输入一个学生的名字，要求得到这个学生对象，并输出学生的信息。
		 */

		Map map = new HashMap();
		Student[] stus = new Student[3];
		stus[0] = new Student("唐僧", 25, "男");
		stus[1] = new Student("孙悟空", 18, "男");
		stus[2] = new Student("白骨精", 23, "女");
		for (int i = 0; i < stus.length; i++) {
			map.put(stus[i].getName(), stus[i]);
		}
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个学生的名字：");
		String name = in.next();
		System.out.println(map.get(name));
	}
}
