package com.lanqiao.task15.test;
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
	@Override
	public void print() {
		// TODO �Զ����ɵķ������
		super.print();
		System.out.println("����һֻ��"+this.strain);
	}
}
 