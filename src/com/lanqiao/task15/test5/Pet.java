package com.lanqiao.task15.test5;
/*��ϰ1:����������������Ϣ
��������: Pet�����︸�ࣩ����Dog��Penguin�ģ�������name��������ֵ��health����
		���ܶȣ�love�����Ժ�print�����ҽ��ܣ�����*/
public class Pet {
	String name;//����
	int health;//����ֵ
	int love;//���ܶ�
	
//	��������޲ι��췽��
	public Pet(){
		
	}
//	��������вι��췽����ʼ��
	public Pet(String name,int health,int love){
		this.name = name;
		this.health = health;
		this.love = love;
	}
	
	//���ҽ���
	public void print(){
		System.out.println("������԰�:\n�ҵ����ֽ�"+this.name+"\t�ҵĽ���ֵ�ǣ�"
	+this.health+"\t�Һ����˵����ܶ��ǣ�"+this.love);
	}
}
 