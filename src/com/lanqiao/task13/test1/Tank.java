package com.lanqiao.task13.test1;
/*创建一个Tank子类从Weapen类继承
具有私有的方向字段dir(上下左右),并用属性封装
定义攻击方法Attack(),打印“我是坦克，向**方向运动,速度***,攻击力***”
为Tank类定义构造函数初始化属性（要求使用super调用父类的构造函数）
*/
public class Tank extends Weapen{
	private String dir;
	public Tank(){
		
	}
	public Tank(String dir,double power,double speed){
		super(power,speed);
		this.dir = dir;
	}
	public void attack(){
		System.out.println("我是坦克，向"+this.dir+"方向运动,速度"+super.speed+",攻击力"+super.power);
	}
	public String getDir() {
		return dir;
	}	
}
