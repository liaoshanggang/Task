package com.lanqiao.date170316.test1;

public class HomeLetterImpl implements HomeLetter{

	@Override
	public String writeTitle() {
		return "�װ��İְ֡�����\n";
	}

	@Override
	public String writeHello() {
		return "\t���Ǻ���\n";
	}

	@Override
	public String writeBody() {
		return "\t��������ͦ�õġ�\n\t�һ�Ŭ��ѧϰ�ģ��Ѿ�ѧ��Java OOP��\n"
				+ "\t�����ϱ������尡��\n";
	}

	@Override
	public String writeGreeting() {
		return "\t����\n����\n";
	}

	@Override
	public String writeSelft() {
		return "\t\t\t\t�ܽ�\n\t\t\t2010��6��1��";
	}

}
