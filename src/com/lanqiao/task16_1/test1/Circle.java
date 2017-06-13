package com.lanqiao.task16_1.test1;
//圆形类
public class Circle extends Graph{
	double apoint;
	double bpoint;
	double r;//半径
	

	public Circle() {
		super();
	}


	public Circle(double xpoint, double ypoint) {
		super(xpoint, ypoint);
	}


	@Override
	public void draw() {
		System.out.println("圆形的画法");
	}
	

}
