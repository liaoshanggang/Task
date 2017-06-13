package com.lanqiao.task15.test1;
//分别创建一只Dog和Panguin然后打印出他们的信息
public class Test {
	public static void main(String[] args) {
		Pet p = new Dog("贝贝",100,0,"家狗");
		p.print();
		p = new Penguin("欧欧",200,0,"男");
		p.print();
		
	}
} 
