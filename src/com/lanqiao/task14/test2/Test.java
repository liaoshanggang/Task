package com.lanqiao.task14.test2;
/*�������ж���һ��ǹ�ı������ô˱�����¼һ����ǹ�Ķ��󣬵������ǹ�Ŀ�ǹ������ע��۲�����Ľ����
�ǵ��õ�ǹ�Ŀ�ǹ���������ǵ��õ���ǹ�Ŀ�ǹ������������һ�ѻ�ǹ�Ķ�����뵽���ǹ�ı�����ȥ��
�ֵ������ǹ�Ŀ�ǹ�������۲�����
��ע�⣺�Ѷ��ӵ����ӿ��󣬵��õķ������Ƕ��ӵģ�*/
public class Test {
	public static void main(String[] args) {
		Gun gun = new HandGun("M1917",1);
		gun.shoot();
		gun = new MachineGun("������",2);
		gun.shoot();
	}
}
