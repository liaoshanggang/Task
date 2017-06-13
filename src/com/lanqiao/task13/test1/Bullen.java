package com.lanqiao.task13.test1;
/*创建一个子弹类Bullen从Weapen类继承
具有私有的type字段(表示子弹类型,如:机枪子弹，步枪子弹)，用属性封装
定义攻击方法Attack()，打印”我是子弹***，速度***，攻击力***”
为Bullen类定义构造函数初始化属性（要求使用super调用父类的构造函数）
*/
public class Bullen extends Weapen{
	private String type;
	public void attack(){
		System.out.println("我是子弹，"+this.type+"，速度"+super.speed+"，攻击力"+super.power);
	}
	public Bullen(){
		
	}
	public Bullen(String type,double power,double speed){
		super(power,speed);
		this.type = type;
	}
}
