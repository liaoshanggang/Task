package com.lanqiao.task14.test2;
/*手枪类(HandGun)：类中有属性品种，重量。还有一个开枪的方法，输出“XX品种的手枪，重XX公斤，一颗子弹打出去了”。
*/
public class HandGun extends Gun{
	public HandGun(){
		
	}
	public HandGun(String type,double weight){
		super(type,weight);
	}
	@Override
	public void shoot() {
		// TODO 自动生成的方法存根
		System.out.println(super.type+"品种的手枪，重"+super.weight+"公斤，一颗子弹打出去了");
	}
	
}
