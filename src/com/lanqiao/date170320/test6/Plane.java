package com.lanqiao.date170320.test6;

//一个飞机类Plane，实现Driverable接口，具有型号的属性
public class Plane implements Driverable {
	String type;// 型号

	public Plane(String type) {
		super();
		this.type = type;
	}

	@Override
	public void driver() {
		System.out.println(type + "平稳的飞着》》》》》》");
	}

}
