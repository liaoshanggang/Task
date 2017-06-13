package com.lanqiao.date170323.atm;

import java.util.Scanner;

/**
 * 需求2： ATM 初始要求：卡默认100000 
 * 录入：银行卡号，取多少钱，密码 
 * 异常：如果卡号不对 1234-123456-1234AB 
 * 钱数：100 -30000 
 * 密码：6 
 * 打印出来：
 * 当前取多少 
 * ----------- 
 * 取款次数 金额
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
		int i = 0;//记录取款次数
		do{
			System.out.println("请输入您的卡号：");
			cardNo = in.next();
			System.out.println("请输入您的密码：");
			pwd = in.nextInt();
			System.out.println("请输入您的取款数：");
			money = in.nextInt();
			i++;
		}while(!verify(cardNo,pwd,money));
		System.out.println("取款次数\t金额");
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
