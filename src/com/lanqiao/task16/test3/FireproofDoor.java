package com.lanqiao.task16.test3;

public class FireproofDoor implements Door{

	@Override
	public void openDoor() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void closeDoor() {
		// TODO 自动生成的方法存根
		
	}
	public void fireproof(){
		System.out.println("该门具有防火功能");
	}

	@Override
	public void print() {
		// TODO 自动生成的方法存根
		fireproof();
	}

}
