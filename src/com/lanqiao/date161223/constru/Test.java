package com.lanqiao.date161223.constru;
/*1������һ���࣬Ϊ���ඨ���������캯�����ֱ�ִ�����в�����
  1��������������ֵ���ҳ����нϴ��һ��ֵ
  2����������doubleֵ�������˻�
  3�����������ַ���ֵ��������Ƿ���ͬ
  4����main�����в��Թ��캯���ĵ���*/
 
public class Test {
	public static void main(String[] args) {
		
		Gouzao gz = new Gouzao(2,3);
		int max = gz.max();
		System.out.println("max:"+max);
		Gouzao gz1 = new Gouzao(1.0,3.0,4.0);
		double sumMul = gz1.mul();
		System.out.println("sumMul:"+sumMul);
		Gouzao gz2 = new Gouzao("23","sdf");
		System.out.println("isEqual:"+gz2.isEqual());
	}
}
