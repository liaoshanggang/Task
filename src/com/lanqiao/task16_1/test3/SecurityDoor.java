package com.lanqiao.task16_1.test3;

public class SecurityDoor implements Door{
	@Override
	public void openDoor() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void closeDoor() {
		// TODO �Զ����ɵķ������
		
	}
	public void theftproof(){
		System.out.println("���ž��з�������");
	}

	@Override
	public void print() {
		// TODO �Զ����ɵķ������
		theftproof();
	}
}
