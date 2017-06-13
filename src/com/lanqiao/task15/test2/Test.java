package com.lanqiao.task15.test2;
//让宠物输出信息变个性化
public class Test {
	public static void main(String[] args) {
		Pet p1 = new Pet();//宠物对象
		p1.print();//打印狗和企鹅的父类宠物对象，输出全部信息
		
		//多态，向上转型，不同对象操作同一动作，产生不同的结果
		Pet p = new Dog("贝贝",100,0,"雪娜瑞");
		p.print();
		p = new Penguin("欧欧",200,0,"Q妹");
		p.print();
	}
} 
