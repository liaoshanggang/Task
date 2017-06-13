package com.lanqiao.task13.test3;
/*5）	请创建一个长度为3的动物数组Animal[] animals = new Animal[3];
6）	分别创建一个狗、猫、猪对象，并将三个对象加入至动物数组内
7）	请采用循环调用动物数组内的每一个动物的love()方法*/
public class Test {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		Dog dog = new Dog();
		Cat cat = new Cat();
		Pig pig = new Pig();
		//多态，向上转型，父类的引用指向子类对象
		animals[0] = dog;
		animals[1] = cat;
		animals[2] = pig;
		for(int i=0;i<animals.length;i++){
			animals[i].love();
		}
	}
}
