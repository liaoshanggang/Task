package com.lanqiao.task14.test2;
/*��������дһ��ǹ��(Gun)�����������ԣ�Ʒ�֣�����ǹ���ǹ���ǹ��type������weight��
 *  ����һ����ǹ�ķ���(shoot)���������ǹ�ˡ���
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
		System.out.println("��ǹ��");
	}
}
