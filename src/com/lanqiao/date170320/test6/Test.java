package com.lanqiao.date170320.test6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		//����һ��set���ϣ�ʹ��HashSet�࣬����������������������ɻ������
		Set set = new HashSet();
		Car[] cars = new Car[5];
		Plane[] planes = new Plane[5];
		for (int i = 0; i < 5; i++) {
			cars[i] = new Car("car" + i);
			planes[i] = new Plane("planes" + i);
			set.add(cars[i]);
			set.add(planes[i]);
		}

		/*Ȼ��ͨ��������ϣ�Ȼ��ʹ��iterator()�������õ�һ����������
		�������еļ����ж��󣬲���������driver()�ķ���*/
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
