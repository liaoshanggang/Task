package com.lanqiao.task15.test6;
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
		System.out.println("������԰�:");
		System.out.println("�ҵ����ֽ�"+this.name+" �ҵĽ���ֵ�ǣ�"+this.health+" �Һ����˵����ܶ��ǣ�"+this.love);
	}
}
 