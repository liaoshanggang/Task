package com.lanqiao.date170320.test5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// ����һ��set���ϣ�ʹ��HashSet�࣬������ʮ��ѧ����Ϣ��
		Set set = new HashSet();
		Student[] stus = new Student[10];
		for (int i = 0; i < stus.length; i++) {
			stus[i] = new Student("��" + i, "" + i);
			set.add(stus[i]);
		}

		// Ȼ��ͨ��������ϣ�Ȼ��ʹ��iterator()�������õ�һ�����������������еļ��������е�Ԫ�أ�
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// ��֤���ϵ�remove()��size()��contains()��isEmpty()��
		System.out.println("remove " + stus[3].getName() + ":"
				+ set.remove(stus[3]));
		System.out.println("size:" + set.size());
		System.out.println("the set iscontains " + stus[5].getName() + ":"
				+ set.contains(stus[5]));
		System.out.println("the set isempty:" + set.isEmpty());
	}

}
