package com.lanqiao.date170320.test9;

/*���ţ�дһ��ѧ�����࣬���������ԣ���ţ�int��������(String)���Ա�(charֻ���ǡ��С���Ů��)�����Գɼ�(double)��
 * �������������Ե�getXXX��setXXX������Ĭ�ϵĹ��췽�������ܳ�ʼ���������ԵĹ��췽����
 */
public class Student {
	int num;// ���
	String name;// ����
	char sex;// charֻ���ǡ��С���Ů��
	double score;// ���Գɼ�

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
		// TODO �Զ����ɵķ������
		return "���:" + this.num + "����:" + this.name + "�Ա�:" + this.sex + "�ɼ�:"
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
