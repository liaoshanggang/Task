package com.lanqiao.date170320.test10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
 ʮ��.����һ��Map����,key��value���涨���ͣ������������,�Ƴ����е�һ�� �������Ƿ���������ݣ�����Map�ĳ��ȡ�
 */
public class Test12 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("����", "����");
		map.put(1, "hello");
		map.put('o', "^V^");
		map.put(new Double(33.4), 33.4);
		System.out.println("�Ƴ�ǰ�Ƿ����hello��" + map.containsValue("hello"));
		map.remove(1);
		System.out.println("�Ƴ����Ƿ����hello��" + map.containsValue("hello"));
	}
}
