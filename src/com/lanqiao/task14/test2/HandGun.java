package com.lanqiao.task14.test2;
/*��ǹ��(HandGun)������������Ʒ�֣�����������һ����ǹ�ķ����������XXƷ�ֵ���ǹ����XX���һ���ӵ����ȥ�ˡ���
*/
public class HandGun extends Gun{
	public HandGun(){
		
	}
	public HandGun(String type,double weight){
		super(type,weight);
	}
	@Override
	public void shoot() {
		// TODO �Զ����ɵķ������
		System.out.println(super.type+"Ʒ�ֵ���ǹ����"+super.weight+"���һ���ӵ����ȥ��");
	}
	
}
