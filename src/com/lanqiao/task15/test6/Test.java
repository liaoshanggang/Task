package com.lanqiao.task15.test6;

import java.util.Random;


public class Test {
	public static void main(String[] args) {
		System.out.println("==================test1=================");
		test1();
		System.out.println("==================test2=================");
		test2();
		System.out.println("==================test3=================");
		test3();
		System.out.println("==================test4=================");
		test4();
		System.out.println("==================test5=================");
		test5();
		System.out.println("==================test6=================");
		test6();
	}
	public static void test6_1(){
		Pet[] pets = new Pet[4];
		for (int i = 0; i < pets.length; i++) {
			Random rd = new Random();
			int index = -1;
			while(true){
				index = rd.nextInt(4);
				if(pets[index]==null){
					break;
				}
			}
			switch (index) {
			case 0:
				pets[index] = new Dog();
				break;
			case 1:
				pets[index] = new Penguin();
				break;
			case 2:
				pets[index] = new HomeCat();
				break;
			case 3:
				pets[index] = new WildCat();
				break;
			}
		}
	}
	/*六、创建长度为4的数组，里面随机存储宠物对象，但不能存储重复的动物，最后打印输出显示
	注意：0、代表狗	1、代表企鹅	2、代表家猫		3、代表野猫*/
	public static void test6(){
		int count=0;
		Pet[] pets = new Pet[4];
		Random rd = new Random();
		while (true) {
			int num = rd.nextInt(4);
			if (pets[num] == null) {
				switch (num) {
				case 0:
					pets[0] = new Dog("小豆",100,10,"警犬");
					pets[0].print();
					count++;
					break;
				case 1:
					pets[1] = new Penguin("欧欧",200,0,"Q妹");
					pets[1].print();
					count++;
					break;
				case 2:
					pets[2] = new HomeCat("小家猫",80,80,"黑白色");
					pets[2].print();
					count++;
					break;
				case 3:
					pets[3] = new WildCat("小野猫",90,90,"红色");
					pets[3].print();
					count++;
					break;
				default:
					break;
				}
			}
			if(count==pets.length){
				break;
			}
		}

	}
	
	
	/*五、在述上中扩展Manager类，在Manager类添加若干个Oper（）重载方法来输出每种动物的显示*/
	public static void test5(){
		Manager m = new Manager();
		m.oper(new Dog("贝贝",50,50,"家狗"));
		m.oper(new Penguin("欧欧",60,60,"男"));
		m.oper(new Cat("小猫",70,70,"白色"));
		m.oper(new HomeCat("小家猫",80,80,"黑白色"));
		m.oper(new WildCat("小野猫",90,90,"红色"));
	}
	
	
	/*四、案例描述：扩展两个子类“家猫和野猫”，然后输出它的介绍*/
	public static void test4(){
		Pet p1 = new HomeCat("小家猫",100,100,"黑白色");
		p1.print();
		
		p1 = new WildCat("小野猫",100,100,"红色");
		p1.print();
	}
	
	
/*	三、让宠物实现可扩展性1
	案例描述：扩展一个子类“猫”，添加它独有的一种属性“颜色”，然后输出它的介绍*/

	public static void test3(){
		Pet p1 = new Cat("小猫",100,100,"白色");
		p1.print();
	}
	
	
/*	二:让宠物输出信息变个性化
	案例描述:在一的基础上，宠物的输出各不相同
			父类：输出信息（介绍全部信息）
			狗狗：输出信息（介绍自己的品种）
			企鹅：输出信息（介绍自己的性别）
			注意：使用方法重写实现*/
	public static void test2(){
		Pet p1 = new Pet();//宠物对象
		p1.print();//打印狗和企鹅的父类宠物对象，输出全部信息
		
		//多态，向上转型，不同对象操作同一动作，产生不同的结果
		Pet p = new Dog("贝贝",100,0,"雪娜瑞");
		p.print();
		
		p = new Penguin("欧欧",200,0,"Q妹");
		p.print();
	}
	
	
/*	一:创建宠物对象并输出信息
	案例描述: Pet（宠物父类）抽象Dog和Penguin的：姓名（name），健康值（health）
	，亲密度（love）属性和print（自我介绍）方法
	Dog的 品种（strain）是单独拥有的
	Panguin的性别（sex）是单独拥有的
	分别创建一只Dog和Panguin然后打印出他们的信息*/
	public static void test1(){
		Pet p = new Dog("贝贝",100,0,"家狗");
		p.print();
		
		p = new Penguin("欧欧",200,0,"男");
		p.print();
	}
} 

//Pet[] pet = new Pet[4];
//Pet pet1 = null;
//Random rd = new Random();
//Random rd1 = new Random();
//
//int index = 0;
//int count = 0;
//int num;
//int num1;
//int temp = 0;
//outer:while(true){
//	//每次循环生成的宠物对象
//	num = rd.nextInt(4);
//	
//	num1 = rd.nextInt(4);
//	//每次随机数生成对应的对象
//	switch(num){
//	case 0:
//		pet1 = new Dog("dog",100,10,"ho");
//		break;
//	case 1:
//		pet1 = new Penguin("欧欧",200,0,"Q妹");
//		break;
//	case 2:
//		pet1= new HomeCat("小家猫",80,80,"黑白色");
//		break;
//	case 3:
//		pet1 = new WildCat("小野猫",90,90,"红色");
//		break;
//	}
//	
//	//判断是否有重复的宠物,如果有重复，不用插入，直接下次生成对象,否则就进入下次判断
//	
//	if(pet[0]==pet1&&pet[1]==pet1&&pet[2]==pet1&&pet[3]==pet1){
//		continue ;
//	}
////	for(int i=0;i<pet.length;i++){
////		if(pet1==pet[i]){
////			continue outer;
////		}else{
////			break;
////		}
////	}
//	if(pet[num1]==null){
//	switch(num1){
//	case 0:
//		pet[0] = pet1;
//		count++;
//		break;
//	case 1:
//		count++;
//		pet[1] = pet1;
//		break;
//	case 2:
//		count++;
//		pet[2] = pet1;
//		break;
//	case 3:
//		count++;
//		pet[3] = pet1;
//		break;
//	}}
////	/*对一次对象进行判断是否有位置,有空的位置说明可以插入，记录位置,接下来就插入，
////	没有空的位置说明满了。结束循环,不在生成对象*/
////		for(int i=0;i<pet.length;i++){
////			if(pet[i]==null){
////				index = i;
////				count++;
////				break ;
////			}
////		}
//		
////		pet[index] = pet1; 
////		if(pet[0]!=null&&pet[1]!=null&&pet[2]!=null&&pet[3]!=null){
//		if(count==4){
//			break;
//		}
//}	
//
//for(int i=0;i<pet.length;i++){
//	pet[i].print();
//}
