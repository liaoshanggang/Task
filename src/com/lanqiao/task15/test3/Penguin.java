package com.lanqiao.task15.test3;
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
	@Override
	public void print() {
		// TODO �Զ����ɵķ������
		super.print();
		System.out.println("�Ա��ǣ�"+this.sex);
	}
}
 