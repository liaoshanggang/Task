package com.lanqiao.date170421.cake;

/*
 * �������������߰���������ɽ��������ÿ������һ��������һ����
 * ���û�����Ǿ͵��ţ���������򣬵����������������ߵ���
 * 
 * 1. ������
 * 2. ��������
 * 3. ��������
 * 4. ������
 */
public class CakesTest {

	public static void main(String[] args) {
		
		Cakes cakes = new Cakes();
		
		Thread pt = new Thread(new ProducterCakes(cakes),"ɽ����ү");
		Thread ct = new Thread(new ConsumeCakes(cakes),"����");
		
		pt.start();
		ct.start();
		
	}

}
