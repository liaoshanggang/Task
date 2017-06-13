package com.lanqiao.task14.test1;
/*红猪的类：类中有属性姓名(name)，攻击力(attack)，颜色（color）。红猪也有一个打人的方法(fight)，
要求在此方法中输出“XX猪是XX颜色的，打掉了人XX点血”。*/
public class Pig extends Monster{
	String color;
	public Pig(){
		
	}
	public Pig(String name,double attack,String color){
		super(name,attack);
		this.color = color;
	}
	public void fight(){
		System.out.println(super.name+"猪是"+this.color+"颜色的，打掉了人"+super.attack+"点血");
	}
}
