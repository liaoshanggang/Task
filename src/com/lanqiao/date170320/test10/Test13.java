package com.lanqiao.date170320.test10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*十三.定义一个Map集合,key是Integer类型,value是Cat类型,然后遍历，调用Cat的叫的方法
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
