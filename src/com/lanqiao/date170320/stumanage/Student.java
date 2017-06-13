package com.lanqiao.date170320.stumanage;

public class Student {
	private String name;// 姓名
	private double[] score = new double[3];// 三门课程

	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Student(String name, double[] score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "姓名：" + this.name + "课程1：" + this.score[0] + "课程2："
				+ this.score[1] + "课程3：" + this.score[2];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double[] getScore() {
		return score;
	}

	public void setScore(double[] score) {
		this.score = score;
	}

}
