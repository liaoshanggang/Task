package com.lanqiao.task16.test1;
//æÿ–Œ¿‡
public class Rectangle extends Graph{
	double width;
	double height;
	
	public Rectangle() {
		super();
	}
	public Rectangle(double xpoint, double ypoint) {
		super(xpoint, ypoint);
	}
	@Override
	public void draw() {
		
	}
	@Override
	public double calArea() {
		return width*height;
	}
	@Override
	public double calC() {
		return (width+height)*2;
	}
	
}
