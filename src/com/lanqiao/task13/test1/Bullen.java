package com.lanqiao.task13.test1;
/*����һ���ӵ���Bullen��Weapen��̳�
����˽�е�type�ֶ�(��ʾ�ӵ�����,��:��ǹ�ӵ�����ǹ�ӵ�)�������Է�װ
���幥������Attack()����ӡ�������ӵ�***���ٶ�***��������***��
ΪBullen�ඨ�幹�캯����ʼ�����ԣ�Ҫ��ʹ��super���ø���Ĺ��캯����
*/
public class Bullen extends Weapen{
	private String type;
	public void attack(){
		System.out.println("�����ӵ���"+this.type+"���ٶ�"+super.speed+"��������"+super.power);
	}
	public Bullen(){
		
	}
	public Bullen(String type,double power,double speed){
		super(power,speed);
		this.type = type;
	}
}
