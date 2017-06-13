package com.lanqiao.date170323.atm;

public class PasswordException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public PasswordException(int pwd) {
		super();
		this.message = "ÃÜÂë£º"+pwd+"²»ÕýÈ·£¡";
	}
	
	@Override
	public String toString() {
		return message;
	}
	
}
