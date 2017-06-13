package com.lanqiao.date170320.test4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*���ģ�����һ��set���ϣ�ʹ��HashSet�࣬������ʮ��Integer����
 * Ȼ��ͨ��������ϣ�Ȼ��ʹ��iterator()�������õ�һ�����������������еļ�����Integer����
 * Ȼ����ת�����ַ���ƴ�ӵ�һ��StringBuffer�����У�Ȼ��������ĳ��Ⱥ;������ݣ�
 * ��֤���ϵ�remove()��size()��contains()��isEmpty()��*/
public class Test {

	public static void main(String[] args) {
		// ����һ��set���ϣ�ʹ��HashSet�࣬������ʮ��Integer����
		Set set = new HashSet();
		Integer[] intNum = new Integer[10];
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = new Integer(i);
			set.add(intNum[i]);
		}

		// Ȼ��ͨ��������ϣ�Ȼ��ʹ��iterator()�������õ�һ�����������������еļ�����Integer����
		// Ȼ����ת�����ַ���ƴ�ӵ�һ��StringBuffer�����У�Ȼ��������ĳ��Ⱥ;������ݣ�
		System.out.println("�����ʮ��Integer����Ϊ��");
		StringBuffer sb = new StringBuffer();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.print(object + " ");
			sb.append(object);
		}
		System.out.println("\nƴ�Ӻ�Ϊ��" + sb + "���ȣ�" + sb.length());
		
		// ��֤���ϵ�remove()��size()��contains()��isEmpty()��
		System.out.println("remove 3:" + set.remove(intNum[3]));
		System.out.println("size:" + set.size());
		System.out.println("the set iscontains 5:" + set.contains(intNum[5]));
		System.out.println("the set isempty:" + set.isEmpty());
	}

}
