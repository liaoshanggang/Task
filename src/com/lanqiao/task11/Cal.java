package com.lanqiao.task11;
/*1������һ���࣬Ϊ���ඨ���������캯�����ֱ�ִ�����в�����
  1��������������ֵ���ҳ����нϴ��һ��ֵ
  2����������doubleֵ�������˻�
  3�����������ַ���ֵ��������Ƿ���ͬ
  4����main�����в��Թ��캯���ĵ���*/
public class Cal {
	int a,b,max;
	double num1,num2,num3;
	String str1,str2;
	
	public Cal(){
		
	}
	
	//1��������������ֵ���ҳ����нϴ��һ��ֵ
	public Cal(int a,int b){
		this.a = a;
		this.b = b;
		//�ж�
		max = a;
		if(b>max){
			max = b;
		}
		System.out.println("max:"+max);
	}
	//2����������doubleֵ�������˻�
	public Cal(double num1,double num2,double num3){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		
		double sum = this.num1 * this.num2 * this.num3;
		System.out.println("�������ĳ˻���"+sum);
	}
	
	//3�����������ַ���ֵ��������Ƿ���ͬ
	public Cal(String str1,String str2){
		this.str1 = str1;
		this.str2 = str2;
		
		if(this.str1.equals(this.str2)){
			System.out.println("�ַ���str1��str2���");
		}else{
			System.out.println("�ַ���str1��str2�����");
		}
	}
}

class CalTest {
	public static void main(String[] args) {
		Cal cal1 = new Cal(10,20);//�Ƚ�������С
		Cal cal2 = new Cal(2.0,3.0,4.0);//��3�����˻�
		Cal cal3 = new Cal("aaa","aaa1111");//�Ƚ��ַ���������
	}
}

