package com.lanqiao.task16.test1;
//Բ����
public class Circle extends Graph{
	double apoint;
	double bpoint;
	double r;//�뾶
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
		// TODO �Զ����ɵķ������
		double area;
		r = Math.sqrt((apoint-xpoint)*(apoint-xpoint)+(apoint-ypoint)*(apoint-ypoint));
		return 3.14*r*r;
	}

	@Override
	public double calC() {
		// TODO �Զ����ɵķ������
		return 3.14*r;
	}
	

}
