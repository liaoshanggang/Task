package com.lanqiao.task14.test1;
/*���ࣺ��������������(name)���й���������(attack)���м���������(foot)����Ҳ��һ�����˵ķ���
(fight)��Ҫ���ڴ˷����������XX����XX�����ܵ�����ǰȥ���ˣ��������XX��Ѫ����*/
public class Snake extends Monster{
	String foot;
	public Snake(){
		
	}
	public Snake(String name,double attack,String foot){
		super(name,attack);
		this.foot = foot;
	}
	public void fight(){
		System.out.println(super.name+"����"+this.foot+"�����ܵ�����ǰȥ���ˣ��������"+super.attack+"��Ѫ");
	}
}
