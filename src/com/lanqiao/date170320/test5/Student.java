package com.lanqiao.date170320.test5;

/*（五）声明一个学生类，有姓名和学号，重写toString();*/
public class Student {
	String name;// 姓名
	String sno;// 学号

	public Student(String name, String sno) {
		super();
		this.name = name;
		this.sno = sno;
	}

	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "该生姓名:" + this.name + " 学号" + this.sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

}
