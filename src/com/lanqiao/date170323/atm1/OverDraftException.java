package com.lanqiao.date170323.atm1;

//�����쳣��
public class OverDraftException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double deficit;// �����

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