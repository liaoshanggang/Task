package com.lanqiao.task14.test1;
/*写一个测试类，生成一只红猪，调用此红猪的打人方法，观察结果。
 * 再生成一条蛇，调用此蛇的打人方法。(注意：代码的重用，及方法重写带来的多态行为)*/
public class Test {
	public static void main(String[] args) {
		Pig pig = new Pig("小肥",100.0,"红");
		pig.fight();
		Snake snake = new Snake("小黑",1000.0,"4");
		snake.fight();
	}
}
