package com.lanqiao.task14.test2;
/*��ǹ��(machineGun)������������Ʒ�֣�����������һ����ǹ�ķ����������XXƷ�ֵĻ�ǹ����XX���һ�������ӵ����ȥ�ˡ���
*/
public class MachineGun extends Gun{
	public MachineGun(){
		
	}
	public MachineGun(String type,double weight){
		super(type,weight);
	}
	@Override
	public void shoot() {
		// TODO �Զ����ɵķ������
		System.out.println(super.type+"Ʒ�ֵĻ�ǹ����"+super.weight+"���һ�������ӵ����ȥ��");
	}
	
}
