package com.lanqiao.date170404.bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 需求2： ATM
 * 初始要求：卡默认100000
 * 录入：银行卡号，取多少钱，密码
 * 异常：如果卡号不对 1234-123456-1234AB
 * 钱数：100 - 30000
 * 密码：6位数
 * 打印出来：当前取多少
 * 还剩多少
 * -----------
 * 取款次数     金额 
 *  1    150.00
 *  2    1000.00
 */
public class AccountServer {

	public static final String AC1 = "1111-111111-1111AA";
	public static final String AC2 = "2222-222222-2222BB";
	public static final String AC3 = "3333-333333-3333CC";
	public static final String AC4 = "4444-444444-4444DD";
	
	public static final String INIT_PWD = "123456";

	public static final Double INIT_BLANCE = 100000.00;
	
	static Map<String,UserAccount> ua = null;
	
	static{
		ua = new HashMap<>();		
		ua.put(AC1, new UserAccount(AC1,INIT_PWD,INIT_BLANCE));
		ua.put(AC2, new UserAccount(AC2,INIT_PWD,INIT_BLANCE));
		ua.put(AC3, new UserAccount(AC3,INIT_PWD,INIT_BLANCE));
		ua.put(AC4, new UserAccount(AC4,INIT_PWD,INIT_BLANCE));
		
	}
	
	public static void main(String[] args) {
		
		AccountServer server = new AccountServer();
		Scanner sc = new Scanner(System.in);
		
		UserAccount loginUA = null;
		
		/*
		 * ATM 7*24 运行，所以这里的循环是不会退出的，除非断电
		 */
		while(true){			
			System.out.println("欢迎使用蓝桥 ATM 系统");
			
			//获取用户的帐号与密码
			System.out.println("请输入你的帐号");
			String loginAccount = sc.nextLine();
			
			System.out.println("请输入你的密码");
			String loginPwd = sc.nextLine();
			
			try {
				//如果帐号密码正确，返回对应的UserAccount对象，注意loginUA是什么
				loginUA = server.checkAc(loginAccount,loginPwd);
				System.out.println("你好，账户余额："+ loginUA.getBalance());
				System.out.println("======================================");
				
				//取款流程
				while(true){			
					System.out.println("请输入取款金额：必须大于100，小于30000");
					
					double money = sc.nextDouble();
					//取钱，
					server.getMoney(loginUA, money);
					sc.nextLine();// nextDouble()读入money，但并没有读入"\n",不得不包含一条额外的nextLine()调用，以去除行的结束符
					
					System.out.println("继续取款吗？ Y or N");
					String selec = sc.nextLine();
					
					if(selec.equalsIgnoreCase("N")){
						System.out.println("bye...");
						break;
					}
				}
				
			} catch (Exception e) {
				System.out.println(">>> 帐号密码不正确，重新登录输入 <<<");
				System.out.println("");
			} 
		}
		
		
	}

	/**
	 * 取款
	 * @param loginUA 当前登录的账户
	 * @param money 取款金额
	 */
	private void getMoney(UserAccount loginUA, double money) {
		try {
			//重要的方法，该方法是UserAccount的一个方法
			if(loginUA.getMoney(money)){
				System.out.println("取款成功，请收回你的银行卡，剩余余额 "+loginUA.getBalance());
				System.out.println("==============================");
				//输出日志
				for (String str : loginUA.getLogs()) {
					System.out.println(str);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * 登录
	 * @param id  账户ID
	 * @param password 密码
	 * @return 登录成功后的用户账户
	 * @throws Exception 
	 */
	private UserAccount checkAc(String id, String password) throws Exception{
		
		UserAccount loginAccount = null;
		
		if(ua.containsKey(id)){
			loginAccount = ua.get(id);
			if(!loginAccount.checkPassword(password)){
				throw new Exception("密码错误");
			}
		}else{
			throw new Exception("账户不存在");
		}
		
		return loginAccount;
		
	}
	
	

}
