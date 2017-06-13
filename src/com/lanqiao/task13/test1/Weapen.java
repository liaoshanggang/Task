package com.lanqiao.task13.test1;
/*（一）、创建一个武器类Weapen
定义类中属性：攻击力Power,速度speed，并实现构造方法
*/
public class Weapen {
	double power;
	double speed;
	public Weapen(){
		
	}
	public Weapen(double power,double speed){
		this.power = power;
		this.speed = speed;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}	
}
