package com.lanqiao.date170323.atm;

public class MoneyException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public MoneyException(double money) {
		super();
		this.message = "取钱数"+money+"不合理";
	}
	
	@Override
	public String toString() {
		return message;
	}
	
}
