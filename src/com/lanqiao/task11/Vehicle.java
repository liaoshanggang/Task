package com.lanqiao.task11;
/*2、请定义一个交通工具(Vehicle)的类，其中有:
属性：速度(speed)，体积(size)等等
方法：移动(move())，设置速度(setSpeed(int speed))，加速speedUp(),减速speedDown()等等.

*/

public class Vehicle {
	public int speed;
	public int size;
	public Vehicle(int speed,int size){
		this.speed = speed;
		this.size = size;
	}
	//移动
	public void move(){
		
	}
	//设置速度
	public void setSpeed(int speed){
		this.speed = speed;
	}
	//加速，每加速一次速度加5
	public void speedUp(){
		speed += 5;
	}
	//减速，每减速一次速度减5
	public void speedDown(){
		speed -= 5;
	}
}
