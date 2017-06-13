package com.lanqiao.task15.test;
//Dog的 品种（strain）是单独拥有的
public class Dog extends Pet{
	private String strain;//品种
	
	//狗类的无参构造方法
	public Dog(){
		
	}
	//狗类的有参构造方法初始化
	public Dog(String name,int health,int love,String strain){
		super(name,health,love);
		this.strain = strain;
	}
	
	//自我介绍
	@Override
	public void print() {
		// TODO 自动生成的方法存根
		super.print();
		System.out.println("我是一只："+this.strain);
	}
}
 