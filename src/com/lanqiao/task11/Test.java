package com.lanqiao.task11;
/*����ڲ�����Vehicle�е�main()��ʵ����һ����ͨ���߶��󣬲�ͨ�����췽��������ʼ��speed,size��ֵ��
 * ����ͨ����ӡ���������⣬���ü��٣����ٵķ������ٶȽ��иı䡣*/
public class Test {
	public static void main(String[] args) {
		Vehicle v = new Vehicle(30,1000);
		System.out.println("����ʼ�ٶ�Ϊ��"+v.speed);
		//����1��
		v.speedUp();
		System.out.println("�����ٵ���"+v.speed);
		//����2��
		v.speedUp();
		v.speedUp();
		System.out.println("�����ٵ���"+v.speed);
		v.speedDown();
		//����3��
		for(int i=0;i<5;i++){
			v.speedDown();
		}
		System.out.println("�����ٵ���"+v.speed);
		
	}
}
