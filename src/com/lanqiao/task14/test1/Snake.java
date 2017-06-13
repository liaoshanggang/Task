package com.lanqiao.task14.test1;
/*蛇类：类中有属性姓名(name)，有攻击力属性(attack)，有几条脚属性(foot)。蛇也有一个打人的方法
(fight)，要求在此方法中输出“XX蛇用XX条脚跑到人面前去打人，打掉了人XX点血”。*/
public class Snake extends Monster{
	String foot;
	public Snake(){
		
	}
	public Snake(String name,double attack,String foot){
		super(name,attack);
		this.foot = foot;
	}
	public void fight(){
		System.out.println(super.name+"蛇用"+this.foot+"条脚跑到人面前去打人，打掉了人"+super.attack+"点血");
	}
}
