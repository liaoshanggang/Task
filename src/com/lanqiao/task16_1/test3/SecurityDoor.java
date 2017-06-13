package com.lanqiao.task16_1.test3;

public class SecurityDoor implements Door{
	@Override
	public void openDoor() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void closeDoor() {
		// TODO 自动生成的方法存根
		
	}
	public void theftproof(){
		System.out.println("该门具有防盗功能");
	}

	@Override
	public void print() {
		// TODO 自动生成的方法存根
		theftproof();
	}
}
