package com.lanqiao.date170316.test2;

public class SoftEngineer implements BizAgent, Programmer {
	private String name;
	
	public SoftEngineer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO �Զ����ɵķ������
		return "����һ���������ʦ���ҵ����ֽ�"+name;
	}

	@Override
	public void writeProgram() {
		// TODO �Զ����ɵķ������
		System.out.println("�һ�д���롣");
	}

	@Override
	public void giveBizSpeech() {
		// TODO �Զ����ɵķ������
		System.out.println("�һὲҵ��");
	}

}
