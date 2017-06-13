package com.lanqiao.date170414.bank;



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
 *  
 *  ATM 日志升级：
 *  ATM 日志输出到文件
 *  账户ID | 取款日志信息
 *  用户下次登录时，选择查询，能在控制台显示之前的取款信息
 */
public class AccountServer {

	
	public static void main(String[] args) {
		
		AccountServer server = new AccountServer();		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * ATM 7*24 运行，所以这里的循环是不会退出的，除非断电
		 */
		while(true){
			System.out.println("欢迎使用蓝桥 ATM 系统");
			
			//获取用户的帐号与密码
			System.out.print("请输入你的帐号:");
			String loginAccount = sc.nextLine();
			
			System.out.print("请输入你的密码:");
			String loginPwd = sc.nextLine();
			
			try {
				//如果帐号密码正确，返回对应的UserAccount对象，注意loginUA是什么
				UserAccount loginUA = server.checkAccount(loginAccount,loginPwd);
				
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
						loginUA.modifyAccountInfo(); //退出时修改账户信息
						loginUA = null;
						System.out.println("bye...");
						break;
					}
					
				}
				
			} catch (Exception e) {
				System.err.println(e.getMessage() + "，重新登录输入 ");
				System.out.println();
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
				System.out.println(loginUA.showLog());
				
			}
		} catch (UserException e) {
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * 登录
	 * @param id  账户ID
	 * @param password 密码
	 * @return 登录成功后的用户账户
	 * @throws LoginException 
	 * @throws Exception 
	 */
	private UserAccount checkAccount(String id, String password) throws UserException, LoginException{
		
		UserRecordUtils ur = new UserRecordUtils();
		UserAccount loginAccount = ur.getAccount(id,password);
		
		if(loginAccount==null){
			throw new LoginException("账户不存在，请确认帐号或密码是否正确");
		}
		
		return loginAccount;
		
	}
	
	

}
