package com.lanqiao.task13.test3;
/*5��	�봴��һ������Ϊ3�Ķ�������Animal[] animals = new Animal[3];
6��	�ֱ𴴽�һ������è������󣬲��������������������������
7��	�����ѭ�����ö��������ڵ�ÿһ�������love()����*/
public class Test {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		Dog dog = new Dog();
		Cat cat = new Cat();
		Pig pig = new Pig();
		//��̬������ת�ͣ����������ָ���������
		animals[0] = dog;
		animals[1] = cat;
		animals[2] = pig;
		for(int i=0;i<animals.length;i++){
			animals[i].love();
		}
	}
}
