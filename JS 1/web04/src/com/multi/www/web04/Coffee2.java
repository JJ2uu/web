package com.multi.www.web04;

public class Coffee2 {
	int price;
	String name;
	public static Coffee2 coffee2;
	
	public static Coffee2 getInstance(int price, String name) {
		if (coffee2 == null) {
			coffee2 = new Coffee2(price, name);
		}
		return coffee2;
	}
	
	public Coffee2(int price, String name) {
		this.price = price;
		this.name = name;
	}
	
	
}
