package com.lanqiao.date170323.atm;

public class PasswordException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public PasswordException(int pwd) {
		super();
		this.message = "���룺"+pwd+"����ȷ��";
	}
	
	@Override
	public String toString() {
		return message;
	}
	
}
