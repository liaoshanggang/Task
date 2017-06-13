package com.lanqiao.task16.test3;

public class Test {
	public static void main(String[] args) {
		Door d = new BulletproofDoor();
		d.print();
		d = new FireproofDoor();
		d.print();
		d = new RustDoor();
		d.print();
		d = new SecurityDoor();
		d.print();
		d = new WaterProofDoor();
		d.print();
		
	}
}
