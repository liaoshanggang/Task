package com.lanqiao.date161223.constru;
public class Gouzao {
	int a;
	int b;
	double c,d,e;
	String str1,str2;
	public Gouzao(int a,int b){
		this.a = a;
		this.b = b;
	}
	public Gouzao(double c,double d,double e){
		this.c = c;
		this.d = d;
		this.e = e;
	}
	public Gouzao(String str1,String str2){
		this.str1 = str1;
		this.str2 = str2;
	}
	public int max(){
		return a>b?a:b;
	}
	public double mul(){
		return c*d*e;
	}
	public boolean isEqual(){
		return str1.equals(str2);
	}
}
