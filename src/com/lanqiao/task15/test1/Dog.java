package com.lanqiao.task15.test1;
//Dog�� Ʒ�֣�strain���ǵ���ӵ�е�
public class Dog extends Pet{
	private String strain;//Ʒ��
	
	//������޲ι��췽��
	public Dog(){
		
	}
	//������вι��췽����ʼ��
	public Dog(String name,int health,int love,String strain){
		super(name,health,love);
		this.strain = strain;
	}
	
	//���ҽ���
	public void print() {
		System.out.println("������԰�:\n�ҵ����ֽ�"+this.name+"\t�ҵĽ���ֵ�ǣ�"+
	this.health+"\t�Һ����˵����ܶ��ǣ�"+this.love+"\t�ҵ�Ʒ���ǣ�"+this.strain);
	}
}
 