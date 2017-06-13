package com.lanqiao.date161223.method;
import java.util.Scanner;
public class TestBubble {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		Bubble bubble = new Bubble();
		int[] arr = new int[8];
		input(arr);
//		int[] arr = {1,23,34,5,6};
		bubble.exchange(arr);
		show(arr);
		sop("hello");
	}
	public static void show(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void input(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print("请输入第"+(i+1)+"个整数:");
			arr[i] = in.nextInt();
		}
	}
	public static void sop(Object o){
		System.out.println(o);
	}
}
