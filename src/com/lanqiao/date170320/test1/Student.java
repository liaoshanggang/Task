package com.lanqiao.date170320.test1;

/*��һ������ѧ���� ������ ѧУ ������ ����toString()
 */
public class Student {
	String name;// ����
	int age;// ����
	String school;// ѧУ

	public Student() {
	}

	public Student(String name, int age, String school) {
		this.name = name;
		this.age = age;
		this.school = school;
	}

	@Override
	public String toString() {
		return "��������Ϊ��" + this.name + "\t���䣺" + this.age + "\tѧУ��"
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
