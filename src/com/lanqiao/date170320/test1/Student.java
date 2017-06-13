package com.lanqiao.date170320.test1;

/*（一）创建学生类 有姓名 学校 和年龄 覆盖toString()
 */
public class Student {
	String name;// 姓名
	int age;// 年龄
	String school;// 学校

	public Student() {
	}

	public Student(String name, int age, String school) {
		this.name = name;
		this.age = age;
		this.school = school;
	}

	@Override
	public String toString() {
		return "该生姓名为：" + this.name + "\t年龄：" + this.age + "\t学校："
				+ this.school;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
}
