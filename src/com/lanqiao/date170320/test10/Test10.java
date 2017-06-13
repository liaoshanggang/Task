package com.lanqiao.date170320.test10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*十、定义一个Map集合,key和value不规定类型，任意放入数据，用keySet()和
 entrySet()两种方式遍历出Map集合的数据
 */
public class Test10 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("李四", "李四");
		map.put(1, "hello");
		map.put('o', "^V^");
		map.put(new Double(33.4), 33.4);
		
		//用keySet()和遍历出Map集合的数据
		for (Object o : map.keySet()) {
			System.out.println(map.get(o));
		}

		//entrySet()遍历出Map集合的数据
		Iterator it = map.entrySet().iterator();
	
		while (it.hasNext()) {
			Object object = (Object) it.next();
			Entry entry = (Entry) object;
			System.out.println(entry + "\t键:" + entry.getKey() + "值:"
					+ entry.getValue());
		}
	}
}
