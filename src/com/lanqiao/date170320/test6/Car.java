package com.lanqiao.date170320.test6;

//һ��������Car��ʵ��Driverable�ӿ�,�����ͺŵ�����
public class Car implements Driverable {
	String type;// �ͺ�

	public Car(String type) {
		super();
		this.type = type;
	}

	@Override
	public void driver() {
		System.out.println(type + "�ɱ��ġ���������");
	}

}
