package com.lanqiao.task15.test4;
//让宠物输出信息变个性化
public class Test {
	public static void main(String[] args) {
		Pet p1 = new HomeCat("小家猫",100,100,"黑白色");
		p1.print();
		p1 = new WildCat("小野猫",100,100,"红色");
		p1.print();
	}
} 
