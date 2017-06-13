package com.lanqiao.task14.test2;
/*（二）、写一个枪类(Gun)，类中有属性：品种（进口枪还是国产枪）type，重量weight。
 *  还有一个开枪的方法(shoot)，输出“开枪了”。
*/
public class Gun {
	String type;
	double weight;
	public Gun(){
		
	}
	public Gun(String type,double weight){
		this.type = type;
		this.weight = weight;
	}
	public void shoot(){
		System.out.println("开枪了");
	}
}
