package com.lanqiao.task11;
/*2���붨��һ����ͨ����(Vehicle)���࣬������:
���ԣ��ٶ�(speed)�����(size)�ȵ�
�������ƶ�(move())�������ٶ�(setSpeed(int speed))������speedUp(),����speedDown()�ȵ�.

*/

public class Vehicle {
	public int speed;
	public int size;
	public Vehicle(int speed,int size){
		this.speed = speed;
		this.size = size;
	}
	//�ƶ�
	public void move(){
		
	}
	//�����ٶ�
	public void setSpeed(int speed){
		this.speed = speed;
	}
	//���٣�ÿ����һ���ٶȼ�5
	public void speedUp(){
		speed += 5;
	}
	//���٣�ÿ����һ���ٶȼ�5
	public void speedDown(){
		speed -= 5;
	}
}
