package com.lanqiao.date170320.test10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*ʮ��.����һ��ArrayList�����࣬Ȼ������ַ��������򣬷�����Iterator��������
*/

public class Test14 {
	public static void main(String[] args) {
		List list = new ArrayList();
		for (int i = 9; i > 0; i--) {
			list.add("String"+i);
		}
		System.out.println("����ǰ��"+list);
		Collections.sort(list);
		System.out.println("�����"+list);
		Collections.reverse(list);
		System.out.print("�����");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.print(object+",");
		}
	}
}
