package com.lanqiao.task16_1.test1;
//Բ����
public class Circle extends Graph{
	double apoint;
	double bpoint;
	double r;//�뾶
	

	public Circle() {
		super();
	}


	public Circle(double xpoint, double ypoint) {
		super(xpoint, ypoint);
	}


	@Override
	public void draw() {
		System.out.println("Բ�εĻ���");
	}
	

}
