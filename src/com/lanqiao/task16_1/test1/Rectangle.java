package com.lanqiao.task16_1.test1;
//������
public class Rectangle extends Graph{
	double width;//���εĿ�
	double length;//���εĳ�
	
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
		System.out.println("���εĻ���");
	}
}
