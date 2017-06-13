package com.lanqiao.date170316.test3;

public class Test {
	public static void main(String[] args) {
		show(new Student());
		show(new Teacher());
		show(new StuParent());
		show(new ForeignGuest());
		show(new Leader());
	}
	public static void show(Person p){
		p.eat();
		p.sleep();
	}
}
