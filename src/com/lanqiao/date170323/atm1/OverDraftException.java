package com.lanqiao.date170323.atm1;

//余额不足异常类
public class OverDraftException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double deficit;// 不足额

	public OverDraftException(String message) {
		super(message);
	}

	public OverDraftException(String message, double deficit) {
		super(message);
		this.deficit = deficit;
	}

	public double getDeficit() {
		return deficit;
	}
}