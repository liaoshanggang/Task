package com.lanqiao.date170320.test2;

/*3��дһ��ѧ�����࣬���������ԣ����������䡢�Ա��������ԡ�Ϊÿһ������дSet��Get��������дһ��toString������
 */
public class Student {
	String name;// ����
	int age;// ����
	String sex;// �Ա�

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
		return "������" + this.name + "\t���䣺" + this.age + "\t�Ա�" + this.sex;
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
