package com.lanqiao.date170320.test5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// 声明一个set集合，使用HashSet类，来保存十个学生信息，
		Set set = new HashSet();
		Student[] stus = new Student[10];
		for (int i = 0; i < stus.length; i++) {
			stus[i] = new Student("李" + i, "" + i);
			set.add(stus[i]);
		}

		// 然后通过这个集合，然后使用iterator()方法，得到一个迭代器，遍历所有的集合中所有的元素；
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 验证集合的remove()、size()、contains()、isEmpty()等
		System.out.println("remove " + stus[3].getName() + ":"
				+ set.remove(stus[3]));
		System.out.println("size:" + set.size());
		System.out.println("the set iscontains " + stus[5].getName() + ":"
				+ set.contains(stus[5]));
		System.out.println("the set isempty:" + set.isEmpty());
	}

}
