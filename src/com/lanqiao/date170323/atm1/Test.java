package com.lanqiao.date170323.atm1;

public class Test {

	public static void main(String[] args) {
		User zhangsan = new User("����", new Account("1234123456123490", 30000),
				123456);
		User lisi = new User("����", new Account("1234123456123480", 20000),
				654321);
		User wangwu = new User("����", new Account("1234123456123430", 80000),
				111111);
		Manager m = new Manager();
		m.addCustomer(zhangsan);
		m.addCustomer(lisi);
		m.addCustomer(wangwu);
		m.mainMenu();

	}

}
