package com.lanqiao.date170320.test2;

/*3、写一个学生的类，类中有属性：姓名、年龄、性别三个属性。为每一个属性写Set与Get方法，再写一个toString方法。
 */
public class Student {
	String name;// 姓名
	int age;// 年龄
	String sex;// 性别

	public Student() {
	}

	public Student(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "姓名：" + this.name + "\t年龄：" + this.age + "\t性别：" + this.sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
