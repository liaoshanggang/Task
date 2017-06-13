package com.lanqiao.date170320.test10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*十四.定义一个ArrayList集合类，然后放入字符串，排序，反序，用Iterator遍历集合
*/

public class Test14 {
	public static void main(String[] args) {
		List list = new ArrayList();
		for (int i = 9; i > 0; i--) {
			list.add("String"+i);
		}
		System.out.println("排序前："+list);
		Collections.sort(list);
		System.out.println("排序后："+list);
		Collections.reverse(list);
		System.out.print("反序后：");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.print(object+",");
		}
	}
}
