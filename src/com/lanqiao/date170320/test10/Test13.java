package com.lanqiao.date170320.test10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*ʮ��.����һ��Map����,key��Integer����,value��Cat����,Ȼ�����������Cat�Ľеķ���
*/
public class Test13 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(new Integer(10), new Cat());
		for (Object o : map.values()) {
			Cat c = (Cat) o;
			c.cry();
		}
		
	}
}
