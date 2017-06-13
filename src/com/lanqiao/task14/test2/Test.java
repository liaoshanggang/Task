package com.lanqiao.task14.test2;
/*测试类中定义一个枪的变量，用此变量记录一个手枪的对象，调用这把枪的开枪方法，注意观察输出的结果，
是调用的枪的开枪方法，还是调用的手枪的开枪方法。再生成一把机枪的对象放入到这个枪的变量中去，
又调用这把枪的开枪方法，观察结果。
（注意：把儿子当老子看后，调用的方法还是儿子的）*/
public class Test {
	public static void main(String[] args) {
		Gun gun = new HandGun("M1917",1);
		gun.shoot();
		gun = new MachineGun("加特林",2);
		gun.shoot();
	}
}
