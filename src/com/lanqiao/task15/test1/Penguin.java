package com.lanqiao.task15.test1;
//Panguin���Ա�Sex���ǵ���ӵ�е�


public class Penguin extends Pet{
	private String sex;//�Ա�
	
	//�������޲ι��췽��
	public Penguin(){
		
	}
	//�������вι��췽����ʼ��
	public Penguin(String name,int health,int love,String sex){
		super(name,health,love);
		this.sex = sex;
	}
	
	//���ҽ���
	public void print() {
		System.out.println("������԰�:\n�ҵ����ֽ�"+this.name+"\t�ҵĽ���ֵ�ǣ�"+
	this.health+"\t�Һ����˵����ܶ��ǣ�"+this.love+"\t�ҵ��Ա��ǣ�"+this.sex);
	}
}
 