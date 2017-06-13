package com.lanqiao.date161223.constru;
/*1、创建一个类，为该类定义三个构造函数，分别执行下列操作：
  1、传递两个整数值并找出其中较大的一个值
  2、传递三个double值并求出其乘积
  3、传递两个字符串值并检查其是否相同
  4、在main方法中测试构造函数的调用*/
 
public class Test {
	public static void main(String[] args) {
		
		Gouzao gz = new Gouzao(2,3);
		int max = gz.max();
		System.out.println("max:"+max);
		Gouzao gz1 = new Gouzao(1.0,3.0,4.0);
		double sumMul = gz1.mul();
		System.out.println("sumMul:"+sumMul);
		Gouzao gz2 = new Gouzao("23","sdf");
		System.out.println("isEqual:"+gz2.isEqual());
	}
}
