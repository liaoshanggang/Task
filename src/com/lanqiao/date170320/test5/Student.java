package com.lanqiao.date170320.test5;

/*���壩����һ��ѧ���࣬��������ѧ�ţ���дtoString();*/
public class Student {
	String name;// ����
	String sno;// ѧ��

	public Student(String name, String sno) {
		super();
		this.name = name;
		this.sno = sno;
	}

	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return "��������:" + this.name + " ѧ��" + this.sno;
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
