package com.lanqiao.task15.test5;
//案例描述：扩展一个子类“猫”，添加它独有的一种属性“颜色”，然后输出它的介绍
public class Cat extends Pet{
	private String color;//颜色
	
	//猫类的无参构造方法
	public Cat() {
		
	}

	//猫类的有参构造方法初始化
	public Cat(String name, int health, int love,String color) {
		super(name, health, love);
		this.color = color;
	}

	//自我介绍
	public void print() {
		super.print();
		System.out.println("颜色是："+this.color);
	}
	
	
}
