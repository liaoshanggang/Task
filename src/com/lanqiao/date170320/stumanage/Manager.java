package com.lanqiao.date170320.stumanage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Manager {
	ArrayList stu = new ArrayList();

	// 学生成绩录入方法,参数stus为待录入信息学生集合
	public void input(Student stus) {
		stu.add(stus);
		System.out.println("添加成功！");
	}

	/*学生成绩修改方法,参数index为修改的学生信息索引,
	 * 另外本方法会在修改前显示该学生信息
	 */
	public void update(int index) {
		Scanner in = new Scanner(System.in);
		Object o = stu.get(index);
		Student s = (Student) o;
		System.out.println("编号\t姓名\t课程1\t课程2\t课程3\t");
		System.out.print(index+"\t"+s.getName()+"\t");
		for (int j = 0; j < s.getScore().length; j++) {
			System.out.print(s.getScore()[j]+"\t");
		}
		System.out.println("\n请输入新的数据：");
		System.out.print("姓名：");
		String name = in.next();
		System.out.println("请输入三门功课的成绩：");
		double[] score = new double[3];
		for (int j = 0; j < score.length; j++) {
			score[j] = in.nextDouble();
		}
		Student st = new Student(name, score);
		stu.remove(index);
		stu.add(index,st);
		System.out.println("修改成功！");
	}
	
	//显示所有学生成绩信息方法
	public void display(){
		System.out.println("编号\t姓名\t课程1\t课程2\t课程3\t");
		for(int i=0;i<stu.size();i++){
			Object o = stu.get(i);
			if(o instanceof Student){
				Student s = (Student) o;
				System.out.print(i+"\t"+s.getName()+"\t");
				for (int j = 0; j < s.getScore().length; j++) {
					System.out.print(s.getScore()[i]+"\t");
				}
				System.out.println();
			}
		}
	}
	
	public void searchById(int id){
		System.out.println("编号\t姓名\t课程1\t课程2\t课程3\t");
		Object o = stu.get(id);
		int i = stu.indexOf(o);
		Student s = (Student) o;
		System.out.println(i+"\t"+s.getName()+"\t"+s.getScore()[0]+s.getScore()[1]+s.getScore()[2]);
	}
	public void searchByName(String name){
		for (Object object : stu) {
			Student s = (Student) object;
			if(s.getName().equals(name)){
				System.out.println("编号\t姓名\t课程1\t课程2\t课程3\t");
				System.out.print(stu.indexOf(object)+"\t"+s.getName()+"\t");
				for (int j = 0; j < s.getScore().length; j++) {
					System.out.print(s.getScore()[j]+"\t");
				}
				System.out.println();
			}
		}
		
	}
	
	// 根据索引删除在集合中删除学生的方法
	public void delete(int index){
		stu.remove(index);
		System.out.println("删除成功！");
	}
	
	//根据姓名删除在集合中删除学生的方法
	public void delete(String name){
		
		int i = 0;
		for (Object o : stu) {
			if(o instanceof Student){
				Student s = (Student) o;
				if(s.getName().equals(name)){
					i = stu.indexOf(o);
					//stu.remove(o);//java.util.ConcurrentModificationException
				}
			}
		}
		stu.remove(i);
		System.out.println("根据名字删除成功！");
		System.out.println("删除成功！");
	}

}
