package com.lanqiao.task15.test1;
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
	public void print() {
		System.out.println("宠物的自白:\n我的名字叫"+this.name+"\t我的健康值是："+
	this.health+"\t我和主人的亲密度是："+this.love+"\t我的品种是："+this.strain);
	}
}
 