package com.lanqiao.date170320.test7;

import java.util.ArrayList;
import java.util.List;

/*���ߣ�ʹ��ArrayList������һ�����϶�����˼��϶����м��롰һֻ�򡱣���һͷţ����
 һ��������װ����1��һ��С����װ����5.8���ټ���һ�����ˡ���Ȼ��ѭ�������Щ�����ֵ��
 */
public class Test {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("һֻ��");
		list.add("һͷţ");
		list.add(new Integer(1));
		list.add(new Double(5.8));
		list.add("��");
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
