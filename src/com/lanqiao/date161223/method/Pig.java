package com.lanqiao.date161223.method;
/*1��дһ�����࣬���е����ԣ�Ʒ�֣���ɫ���������������з�����
   �޷���ֵ�ķ�����
��һ������·�ķ�����û�з���ֵ��Ҫ�������ʽΪ��ĳĳƷ�ֵ�ĳĳ��ɫ����������ȥ����
����������˵ķ�����û�з���ֵ��Ҫ�������ʽΪ��ĳĳƷ�ֵ�ĳĳ��ɫ��������ˣ�������Ϊ���١���
(������Է��ķ�����û�з���ֵ��Ҫ�������ʽΪ��ĳĳƷ�ֵ�ĳĳ��ɫ����Ե���ࡱ��
   �з���ֵ�ķ�����
��һ����ʾ������Ϣ�ķ�����toString)��
�������õ�����Ʒ�ֵķ�����Ҫ���ڴ˷�����û����������ش����Ʒ�֡�
�������õ�������ɫ�ķ�����Ҫ���ڴ˷�����û����������ش������ɫ��*/
public class Pig {
	String category;
	String color;
	int attact;
	
	public void walk(){
		System.out.println(category+"Ʒ��"+color+"��ɫ����������ȥ");
	}
	public void attack(){
		System.out.println(category+"Ʒ��"+color+"��ɫ��������ˣ�������Ϊ��"+attact);
	}
	public void eat(){
		System.out.println(category+"Ʒ��"+color+"��ɫ����Ե����");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "����������ϢƷ�֣�"+category+" ��ɫ��"+color+" ������"+attact;
	}
	
	public String getCategory(){
		return category;
	}
	public String getColor(){
		return color;
	}
}
