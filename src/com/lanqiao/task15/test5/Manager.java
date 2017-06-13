package com.lanqiao.task15.test5;
//五、在述上中扩展Manager类，在Manager类添加若干个Oper（）重载方法来输出每种动物的显示
public class Manager {
	
//	public void oper(Pet p){
//		p.print();
//	}
	public void oper(Dog d){
		d.print();
	}
	public void oper(Penguin pg){
		pg.print();
	}
	public void oper(Cat c){
		c.print();
	}
	public void oper(HomeCat hc){
		hc.print();
	}
	public void oper(WildCat wc){
		wc.print();
	}
}
