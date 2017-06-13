package com.lanqiao.date170320.test6;

//一个汽车类Car，实现Driverable接口,具有型号的属性
public class Car implements Driverable {
	String type;// 型号

	public Car(String type) {
		super();
		this.type = type;
	}

	@Override
	public void driver() {
		System.out.println(type + "飞奔的。。。。。");
	}

}
