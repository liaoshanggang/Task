package com.lanqiao.task14.test1;
/*������ࣺ��������������(name)��������(attack)����ɫ��color��������Ҳ��һ�����˵ķ���(fight)��
Ҫ���ڴ˷����������XX����XX��ɫ�ģ��������XX��Ѫ����*/
public class Pig extends Monster{
	String color;
	public Pig(){
		
	}
	public Pig(String name,double attack,String color){
		super(name,attack);
		this.color = color;
	}
	public void fight(){
		System.out.println(super.name+"����"+this.color+"��ɫ�ģ��������"+super.attack+"��Ѫ");
	}
}
