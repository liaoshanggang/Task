package com.lanqiao.date170320.test6;

//һ���ɻ���Plane��ʵ��Driverable�ӿڣ������ͺŵ�����
public class Plane implements Driverable {
	String type;// �ͺ�

	public Plane(String type) {
		super();
		this.type = type;
	}

	@Override
	public void driver() {
		System.out.println(type + "ƽ�ȵķ��š�����������");
	}

}
