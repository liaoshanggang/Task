package com.lanqiao.date170320.test10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
ʮһ.����һ��Map����,key��value���涨���ͣ������������,�����õ����õ�value������
*/
public class Test11 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("����", "����");
		map.put(1, "hello");
		map.put('o', "^V^");
		map.put(new Double(33.4), 33.4);
		
		//ͨ��values()
		for (Object o : map.values()) {
			System.out.println(o);
		}
	}
}
