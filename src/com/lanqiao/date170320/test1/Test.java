package com.lanqiao.date170320.test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(0, new Student("һ��", 25, "����"));
		list.add(1, new Student("С��", 23, "�廪"));

		// 2�ڵ�2��λ�ò���1��ѧ����Ϣ
		list.add(1, new Student("���»�", 20, "����"));

		// 3�ж� ���»����ѧ���Ƿ���� ���ھʹ����,
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			if (obj instanceof Student) {
				Student stu = (Student) obj;
				if (stu.getName() == "���»�") {
					System.out.println("����" + stu.toString());
				}
			}
		}

		// 4���ȫ��ѧ����Ϣ ֱ�Ӵ�ӡ����
		System.out.println("===========ȫ��ѧ����Ϣ===========");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
