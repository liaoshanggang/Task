package com.lanqiao.task16_1.test1;
//三角形类
public class Trangle extends Graph{
	
	public Trangle() {
		super();
	}

	public Trangle(double xpoint, double ypoint) {
		super(xpoint, ypoint);
	
	}

	@Override
	public void draw() {
		System.out.println("三角形的画法");
	}

	
}
