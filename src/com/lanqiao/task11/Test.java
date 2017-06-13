package com.lanqiao.task11;
/*最后在测试类Vehicle中的main()中实例化一个交通工具对象，并通过构造方法给它初始化speed,size的值，
 * 并且通过打印出来。另外，调用加速，减速的方法对速度进行改变。*/
public class Test {
	public static void main(String[] args) {
		Vehicle v = new Vehicle(30,1000);
		System.out.println("车初始速度为："+v.speed);
		//加速1次
		v.speedUp();
		System.out.println("车加速到了"+v.speed);
		//加速2次
		v.speedUp();
		v.speedUp();
		System.out.println("车加速到了"+v.speed);
		v.speedDown();
		//减速3次
		for(int i=0;i<5;i++){
			v.speedDown();
		}
		System.out.println("车减速到了"+v.speed);
		
	}
}
