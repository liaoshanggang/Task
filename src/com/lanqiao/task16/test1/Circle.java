package com.lanqiao.task16.test1;
//圆形类
public class Circle extends Graph{
	double apoint;
	double bpoint;
	double r;//半径
	public Circle() {
		
	}
	public Circle(double apoint, double bpoint, double r) {
		super();
		this.apoint = apoint;
		this.bpoint = bpoint;
		this.r = r;
	}

	@Override
	public void draw() {
	
	}

	@Override
	public double calArea() {
		// TODO 自动生成的方法存根
		double area;
		r = Math.sqrt((apoint-xpoint)*(apoint-xpoint)+(apoint-ypoint)*(apoint-ypoint));
		return 3.14*r*r;
	}

	@Override
	public double calC() {
		// TODO 自动生成的方法存根
		return 3.14*r;
	}
	

}
