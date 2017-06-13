package com.lanqiao.task15.test3;
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
	@Override
	public void print() {
		// TODO 自动生成的方法存根
		super.print();
		System.out.println("性别是："+this.sex);
	}
}
 