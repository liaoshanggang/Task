package com.lanqiao.task15.test5;

//让宠物输出信息变个性化
public class Test {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.oper(new Dog("贝贝",50,50,"家狗"));
		m.oper(new Penguin("欧欧",60,60,"男"));
		m.oper(new Cat("小猫",70,70,"白色"));
		m.oper(new HomeCat("小家猫",80,80,"黑白色"));
		m.oper(new WildCat("小野猫",90,90,"红色"));
	}
} 
