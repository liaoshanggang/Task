package com.lanqiao.date170320.test4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*（四）声明一个set集合，使用HashSet类，来保存十个Integer对象，
 * 然后通过这个集合，然后使用iterator()方法，得到一个迭代器，遍历所有的集合中Integer对象；
 * 然后将它转换成字符串拼接到一个StringBuffer对象中，然后输出它的长度和具体内容；
 * 验证集合的remove()、size()、contains()、isEmpty()等*/
public class Test {

	public static void main(String[] args) {
		// 声明一个set集合，使用HashSet类，来保存十个Integer对象，
		Set set = new HashSet();
		Integer[] intNum = new Integer[10];
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = new Integer(i);
			set.add(intNum[i]);
		}

		// 然后通过这个集合，然后使用iterator()方法，得到一个迭代器，遍历所有的集合中Integer对象；
		// 然后将它转换成字符串拼接到一个StringBuffer对象中，然后输出它的长度和具体内容；
		System.out.println("保存的十个Integer对象为：");
		StringBuffer sb = new StringBuffer();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.print(object + " ");
			sb.append(object);
		}
		System.out.println("\n拼接后为：" + sb + "长度：" + sb.length());
		
		// 验证集合的remove()、size()、contains()、isEmpty()等
		System.out.println("remove 3:" + set.remove(intNum[3]));
		System.out.println("size:" + set.size());
		System.out.println("the set iscontains 5:" + set.contains(intNum[5]));
		System.out.println("the set isempty:" + set.isEmpty());
	}

}
