package com.lanqiao.date161223.method;
/*1、写一个猪类，类中的属性：品种，颜色，攻击力。类中有方法：
   无返回值的方法：
（一）猪走路的方法，没有返回值，要求输出格式为“某某品种的某某颜色的猪走来走去”。
（二）猪打人的方法，没有返回值，要求输出格式为“某某品种的某某颜色的猪打人了，攻击力为多少”。
(三）猪吃饭的方法，没有返回值，要求输出格式为“某某品种的某某颜色的猪吃得真多”。
   有返回值的方法：
（一）显示自身信息的方法（toString)。
（二）得到此猪品种的方法，要求在此方法中没有输出，返回此猪的品种。
（三）得到此猪颜色的方法，要求在此方法中没有输出，返回此猪的颜色。*/
public class Pig {
	String category;
	String color;
	int attact;
	
	public void walk(){
		System.out.println(category+"品种"+color+"颜色的猪走来走去");
	}
	public void attack(){
		System.out.println(category+"品种"+color+"颜色的猪打人了，攻击力为："+attact);
	}
	public void eat(){
		System.out.println(category+"品种"+color+"颜色的猪吃得真多");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "该猪自身信息品种："+category+" 颜色："+color+" 攻击力"+attact;
	}
	
	public String getCategory(){
		return category;
	}
	public String getColor(){
		return color;
	}
}
