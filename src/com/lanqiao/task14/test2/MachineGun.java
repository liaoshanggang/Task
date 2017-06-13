package com.lanqiao.task14.test2;
/*机枪类(machineGun)：类中有属性品种，重量。还有一个开枪的方法，输出“XX品种的机枪，重XX公斤，一连串的子弹打出去了”。
*/
public class MachineGun extends Gun{
	public MachineGun(){
		
	}
	public MachineGun(String type,double weight){
		super(type,weight);
	}
	@Override
	public void shoot() {
		// TODO 自动生成的方法存根
		System.out.println(super.type+"品种的机枪，重"+super.weight+"公斤，一连串的子弹打出去了");
	}
	
}
