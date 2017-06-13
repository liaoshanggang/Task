package com.lanqiao.date170320.test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(0, new Student("一哥", 25, "哈佛"));
		list.add(1, new Student("小二", 23, "清华"));

		// 2在第2个位置插入1个学生信息
		list.add(1, new Student("刘德华", 20, "北大"));

		// 3判断 刘德华这个学生是否存在 存在就打出来,
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			if (obj instanceof Student) {
				Student stu = (Student) obj;
				if (stu.getName() == "刘德华") {
					System.out.println("存在" + stu.toString());
				}
			}
		}

		// 4输出全部学生信息 直接打印对象
		System.out.println("===========全部学生信息===========");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
