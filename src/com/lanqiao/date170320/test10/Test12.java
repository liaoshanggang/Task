package com.lanqiao.date170320.test10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
 十二.定义一个Map集合,key和value不规定类型，任意放入数据,移除其中的一个 ，测试是否包含的数据，测试Map的长度。
 */
public class Test12 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("李四", "李四");
		map.put(1, "hello");
		map.put('o', "^V^");
		map.put(new Double(33.4), 33.4);
		System.out.println("移除前是否包含hello：" + map.containsValue("hello"));
		map.remove(1);
		System.out.println("移除后是否包含hello：" + map.containsValue("hello"));
	}
}
