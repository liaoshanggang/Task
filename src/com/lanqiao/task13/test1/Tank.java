package com.lanqiao.task13.test1;
/*����һ��Tank�����Weapen��̳�
����˽�еķ����ֶ�dir(��������),�������Է�װ
���幥������Attack(),��ӡ������̹�ˣ���**�����˶�,�ٶ�***,������***��
ΪTank�ඨ�幹�캯����ʼ�����ԣ�Ҫ��ʹ��super���ø���Ĺ��캯����
*/
public class Tank extends Weapen{
	private String dir;
	public Tank(){
		
	}
	public Tank(String dir,double power,double speed){
		super(power,speed);
		this.dir = dir;
	}
	public void attack(){
		System.out.println("����̹�ˣ���"+this.dir+"�����˶�,�ٶ�"+super.speed+",������"+super.power);
	}
	public String getDir() {
		return dir;
	}	
}
