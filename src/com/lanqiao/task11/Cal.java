package com.lanqiao.task11;
/*1、创建一个类，为该类定义三个构造函数，分别执行下列操作：
  1、传递两个整数值并找出其中较大的一个值
  2、传递三个double值并求出其乘积
  3、传递两个字符串值并检查其是否相同
  4、在main方法中测试构造函数的调用*/
public class Cal {
	int a,b,max;
	double num1,num2,num3;
	String str1,str2;
	
	public Cal(){
		
	}
	
	//1、传递两个整数值并找出其中较大的一个值
	public Cal(int a,int b){
		this.a = a;
		this.b = b;
		//判断
		max = a;
		if(b>max){
			max = b;
		}
		System.out.println("max:"+max);
	}
	//2、传递三个double值并求出其乘积
	public Cal(double num1,double num2,double num3){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		
		double sum = this.num1 * this.num2 * this.num3;
		System.out.println("三个数的乘积："+sum);
	}
	
	//3、传递两个字符串值并检查其是否相同
	public Cal(String str1,String str2){
		this.str1 = str1;
		this.str2 = str2;
		
		if(this.str1.equals(this.str2)){
			System.out.println("字符串str1与str2相等");
		}else{
			System.out.println("字符串str1与str2不相等");
		}
	}
}

class CalTest {
	public static void main(String[] args) {
		Cal cal1 = new Cal(10,20);//比较两数大小
		Cal cal2 = new Cal(2.0,3.0,4.0);//求3个数乘积
		Cal cal3 = new Cal("aaa","aaa1111");//比较字符串的内容
	}
}

