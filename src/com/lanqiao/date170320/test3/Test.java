package com.lanqiao.date170320.test3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*����������һ��set���ϣ�ʹ��HashSet�࣬������ʮ���ַ�����Ϣ��Ȼ��ͨ��������ϣ�
 * Ȼ��ʹ��iterator()�������õ�һ�����������������еļ��������е��ַ�����
 * Ȼ���ó����е��ַ���ƴ�ӵ�һ��StringBuffer�����У�Ȼ��������ĳ��Ⱥ;������ݣ� 
 *  ��֤���ϵ�remove()��size()��contains()��isEmpty()��*/
public class Test {

	public static void main(String[] args) {
		Set set = new HashSet();
		// ����ʮ���ַ�����Ϣ
		for (int i = 0; i < 10; i++) {
			set.add("String" + i);
		}

		// ���������ʮ���ַ�����ƴ��
		StringBuffer sb = new StringBuffer();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println("�ַ�����" + obj);
			sb.append(obj);
		}
		System.out.println("ƴ�Ӻ�" + sb + "\n����Ϊ��" + sb.length());

		// ��֤���ϵ�remove()��size()��contains()��isEmpty()
		System.out.println("ɾ��String1" + ":" + set.remove("Stirng1"));
		System.out.println("the set size:" + set.size());
		System.out.println("the set iscontains \"String1\":"
				+ set.contains("String1"));
		System.out.println("the set isEmpty:" + set.isEmpty());

	}

}
