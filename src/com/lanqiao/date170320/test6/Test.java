package com.lanqiao.date170320.test6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		//声明一个set集合，使用HashSet类，来保存五个汽车类对象，五个飞机类对象，
		Set set = new HashSet();
		Car[] cars = new Car[5];
		Plane[] planes = new Plane[5];
		for (int i = 0; i < 5; i++) {
			cars[i] = new Car("car" + i);
			planes[i] = new Plane("planes" + i);
			set.add(cars[i]);
			set.add(planes[i]);
		}

		/*然后通过这个集合，然后使用iterator()方法，得到一个迭代器，
		遍历所有的集合中对象，并调用他们driver()的方法*/
		Iterator it = set.iterator();
		Driverable d = null;
		while (it.hasNext()) {
			Object object = (Object) it.next();
			if (object instanceof Car) {
				d = (Car) object;
			} else if (object instanceof Plane) {
				d = (Plane) object;
			}
			d.driver();
		}
	}
}
