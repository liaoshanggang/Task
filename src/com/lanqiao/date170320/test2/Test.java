package com.lanqiao.date170320.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*������1������һ��ArrayList���ϣ��������з����ַ�����a��,"b","c",��������5,9�����ʹ��ѭ�������
 2������һ��Set���ϣ���1,2,3,4,5����������ַ��뵽�����У����ʹ�õ��������������������
 */
public class Test {
	public static void main(String[] args) {
		// 1������һ��ArrayList���ϣ��������з����ַ�����a��,"b","c",��������5,9�����ʹ��ѭ�������
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

		// 2������һ��Set���ϣ���1,2,3,4,5����������ַ��뵽�����У����ʹ�õ��������������������
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
		 * дһ�������࣬��main��������������ѧ������������һ��Map���󣬽�������ѧ�����뵽Map�У�Ҫ��keyΪѧ����������
		 * valueΪѧ�������������һ��ѧ�������֣�Ҫ��õ����ѧ�����󣬲����ѧ������Ϣ��
		 */

		Map map = new HashMap();
		Student[] stus = new Student[3];
		stus[0] = new Student("��ɮ", 25, "��");
		stus[1] = new Student("�����", 18, "��");
		stus[2] = new Student("�׹Ǿ�", 23, "Ů");
		for (int i = 0; i < stus.length; i++) {
			map.put(stus[i].getName(), stus[i]);
		}
		Scanner in = new Scanner(System.in);
		System.out.println("������һ��ѧ�������֣�");
		String name = in.next();
		System.out.println(map.get(name));
	}
}
