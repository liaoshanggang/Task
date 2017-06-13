package com.lanqiao.date170320.test9;

/*（九）写一个学生的类，类中有属性：编号（int），姓名(String)，性别(char只能是‘男’或‘女’)，考试成绩(double)。
 * 类中有所有属性的getXXX与setXXX方法。默认的构造方法，及能初始化所有属性的构造方法。
 */
public class Student {
	int num;// 编号
	String name;// 姓名
	char sex;// char只能是‘男’或‘女’
	double score;// 考试成绩

	public Student() {
	}

	public Student(int num, String name, char sex, double score) {
		super();
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "编号:" + this.num + "姓名:" + this.name + "性别:" + this.sex + "成绩:"
				+ this.score;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
