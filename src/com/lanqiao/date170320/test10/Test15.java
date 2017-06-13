package com.lanqiao.date170320.test10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*十五.定义一个Map集合内，key是Cat类型,value是ArrayList类型,根据key拿到
value,再遍历出集合的数据
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
