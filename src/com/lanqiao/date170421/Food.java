package com.lanqiao.date170421;

public class Food {
	String name;
	double price;
	boolean next;

	public Food() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean hasNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + "Ԫ]";
	}

}
