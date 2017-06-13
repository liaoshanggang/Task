package com.lanqiao.task16_1.test1;
//矩形类
public class Rectangle extends Graph{
	double width;//矩形的宽
	double length;//矩形的长
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(double xpoint, double ypoint,double width,double length) {
		super(xpoint, ypoint);
		this.width = width;
		this.length = length;
	}
	@Override
	public void draw() {
		System.out.println("矩形的画法");
	}
}
