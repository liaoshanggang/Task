package com.lanqiao.date170320.stumanage;

public class Student {
	private String name;// ����
	private double[] score = new double[3];// ���ſγ�

	public Student() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public Student(String name, double[] score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return "������" + this.name + "�γ�1��" + this.score[0] + "�γ�2��"
				+ this.score[1] + "�γ�3��" + this.score[2];
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
