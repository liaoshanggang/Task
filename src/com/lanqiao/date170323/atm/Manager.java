package com.lanqiao.date170323.atm;

import java.util.Scanner;

/**
 * ����2�� ATM ��ʼҪ�󣺿�Ĭ��100000 
 * ¼�룺���п��ţ�ȡ����Ǯ������ 
 * �쳣��������Ų��� 1234-123456-1234AB 
 * Ǯ����100 -30000 
 * ���룺6 
 * ��ӡ������
 * ��ǰȡ���� 
 * ----------- 
 * ȡ����� ���
 *  1 	150.00
 *  2 	1000.00
 * 
 * @author gg
 *
 */
public class Manager {
	static Scanner in = new Scanner(System.in);
	
	public Manager() {
	}
	
	public void mainMenu(){
		String cardNo;
		int pwd;
		int money;
		int i = 0;//��¼ȡ�����
		do{
			System.out.println("���������Ŀ��ţ�");
			cardNo = in.next();
			System.out.println("�������������룺");
			pwd = in.nextInt();
			System.out.println("����������ȡ������");
			money = in.nextInt();
			i++;
		}while(!verify(cardNo,pwd,money));
		System.out.println("ȡ�����\t���");
		for (int j = 0; j < i; j++) {
			System.out.print(i+"\t"+money);
		}
	}

	private boolean verify(String cardNo, int pwd, int money) {
		boolean flag = false;
		String s = "";
		if(cardNo.length()>16&&!cardNo.equals("12341234561234AB")){
			flag = false;
			throw new CardNoException(cardNo);
		}else{
			flag = true;
		}
		
		s = s.valueOf(pwd);
		if(s.length()!=6){
			flag = false;
			throw new PasswordException(pwd);
		}else{
			flag = true;
		}
		
		if(money<100||money>30000){
			flag = false;
			throw new MoneyException(money);
		}else{
			flag = true;
		}
		return flag;
	}
}
