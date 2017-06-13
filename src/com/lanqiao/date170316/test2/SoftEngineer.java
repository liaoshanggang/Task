package com.lanqiao.date170316.test2;

public class SoftEngineer implements BizAgent, Programmer {
	private String name;
	
	public SoftEngineer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO 自动生成的方法存根
		return "我是一名软件工程师，我的名字叫"+name;
	}

	@Override
	public void writeProgram() {
		// TODO 自动生成的方法存根
		System.out.println("我会写代码。");
	}

	@Override
	public void giveBizSpeech() {
		// TODO 自动生成的方法存根
		System.out.println("我会讲业务。");
	}

}
