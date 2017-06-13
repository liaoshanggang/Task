package com.lanqiao.task15.test5;
/*练习1:创建宠物对象并输出信息
案例描述: Pet（宠物父类）抽象Dog和Penguin的：姓名（name），健康值（health），
		亲密度（love）属性和print（自我介绍）方法*/
public class Pet {
	String name;//姓名
	int health;//健康值
	int love;//亲密度
	
//	宠物类的无参构造方法
	public Pet(){
		
	}
//	宠物类的有参构造方法初始化
	public Pet(String name,int health,int love){
		this.name = name;
		this.health = health;
		this.love = love;
	}
	
	//自我介绍
	public void print(){
		System.out.println("宠物的自白:\n我的名字叫"+this.name+"\t我的健康值是："
	+this.health+"\t我和主人的亲密度是："+this.love);
	}
}
 