package com.lanqiao.date170323.atm;

public class CardNoException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public CardNoException(String cardNo) {
		super();
		this.message = "银行卡号"+cardNo+"不正确！";
	}
	
	@Override
	public String toString() {
		return message;
	}
	
}
