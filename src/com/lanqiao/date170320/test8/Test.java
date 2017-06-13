package com.lanqiao.date170320.test8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*（八）使用LinkedList类生成一个集合对象，循环加入“小样1”，“小样2”,“小样3”,“小样4”,“小样5”……“小样100”。
 * 输出这个集合的大小。再使用循环删除这个集合中所有名字为偶数的对象，比如“小样6”，“小样100”，都是偶数名。
 * 最后：循环输出集合中所有的对象，看是否删除成功。
 */
public class Test {
	public static void main(String[] args) {
		// 循环加入“小样1”，“小样2”,“小样3”,“小样4”,“小样5”……“小样100”
		List list = new LinkedList();
		for (int i = 1; i <= 100; i++) {
			list.add(i - 1, "小样" + i);
		}

		System.out.println("这个集合大小为：" + list.size());

		// 删除这个集合中所有名字为偶数的对象
		for (int i = list.size() - 1; i >= 0; i--) {
			//从集合中取出元素并提取数字部分字符串
			String s = list.get(i).toString().substring(2);
			int j = Integer.parseInt(s);
			if (j % 2 == 0) {
				// System.out.println(list.get(j-1));//查看是否为偶数名
				list.remove(j - 1);
			}
		}
		
		System.out.println("删除这个集合中所有名字为偶数的对象后集合变为:");
		// 最后：循环输出集合中所有的对象，看是否删除成功。
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}
}
