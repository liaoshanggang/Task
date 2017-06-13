package com.lanqiao.task16.test3;

public class WaterProofDoor implements Door{

	@Override
	public void openDoor() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void closeDoor() {
		// TODO 自动生成的方法存根
		
	}
	
	public void waterproof(){
		System.out.println("该门具有防水功能");
	}

	@Override
	public void print() {
		// TODO 自动生成的方法存根
		waterproof();
	}
}
