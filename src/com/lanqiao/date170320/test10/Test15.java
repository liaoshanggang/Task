package com.lanqiao.date170320.test10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*ʮ��.����һ��Map�����ڣ�key��Cat����,value��ArrayList����,����key�õ�
value,�ٱ��������ϵ�����
*/
public class Test15 {
	public static void main(String[] args) {
		Map map = new HashMap();
		ArrayList list = new ArrayList();
		map.put(new Cat(), list);
		//map.put(new Cat(), new ArrayList());
		for (Object o : map.keySet()) {
			Cat c = (Cat) o;
			c.cry();
			System.out.println(map.get(c));
		}
	}
}
