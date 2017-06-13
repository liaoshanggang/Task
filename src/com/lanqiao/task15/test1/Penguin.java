package com.lanqiao.task15.test1;
//Panguin的性别（Sex）是单独拥有的


public class Penguin extends Pet{
	private String sex;//性别
	
	//企鹅类的无参构造方法
	public Penguin(){
		
	}
	//企鹅类的有参构造方法初始化
	public Penguin(String name,int health,int love,String sex){
		super(name,health,love);
		this.sex = sex;
	}
	
	//自我介绍
	public void print() {
		System.out.println("宠物的自白:\n我的名字叫"+this.name+"\t我的健康值是："+
	this.health+"\t我和主人的亲密度是："+this.love+"\t我的性别是："+this.sex);
	}
}
 