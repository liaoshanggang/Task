package com.lanqiao.task16_1.test1;
/*��һ������������̳�
���һ����ϸ��Ϊ���Ρ������Ρ�Բ�κ���Բ�εġ�ͼ�Ρ��ࡣ
ʹ�ü̳н���Щͼ�η��࣬�ҳ�����Ϊ���ಿ�ֵĹ�ͬ����(��У׼��)�ͷ���(�续������ʼ��)��
��������Щͼ���Ƿ��ܽ�һ������Ϊ���ࡣ
����ֻ����ʵ��˼�룬�����Ǿ���ʵ�ֵ�ϸ�ڣ�ʵ�ַ�ʽ�����ɷ��ӡ�*/
//ͼ�γ�����
public abstract class Graph {
	//У׼��
	double xpoint;
	double ypoint;
	
	public Graph(){
		
	}
	public Graph(double xpoint, double ypoint) {
		this.xpoint = xpoint;
		this.ypoint = ypoint;
	}
	public abstract void draw();//����
}
