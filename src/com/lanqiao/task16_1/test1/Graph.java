package com.lanqiao.task16_1.test1;
/*（一）、抽象类与继承
设计一个能细分为矩形、三角形、圆形和椭圆形的“图形”类。
使用继承将这些图形分类，找出能作为基类部分的共同特征(如校准点)和方法(如画法、初始化)，
并看看这些图形是否能进一步划分为子类。
本题只考虑实现思想，不考虑具体实现的细节，实现方式可自由发挥。*/
//图形抽象类
public abstract class Graph {
	//校准点
	double xpoint;
	double ypoint;
	
	public Graph(){
		
	}
	public Graph(double xpoint, double ypoint) {
		this.xpoint = xpoint;
		this.ypoint = ypoint;
	}
	public abstract void draw();//画法
}
