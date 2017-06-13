package com.lanqiao.date170320.test10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
十一.定义一个Map集合,key和value不规定类型，任意放入数据,单独拿到所用的value的数据
*/
public class Test11 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("李四", "李四");
		map.put(1, "hello");
		map.put('o', "^V^");
		map.put(new Double(33.4), 33.4);
		
		//通过values()
		for (Object o : map.values()) {
			System.out.println(o);
		}
	}
}
