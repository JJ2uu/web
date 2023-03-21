package com.multi.www.web04;

public class CoffeeMain2 {

	public static void main(String[] args) {
		Coffee2 c1 = Coffee2.getInstance(1000, "라떼");
		Coffee2 c2 = Coffee2.getInstance(2000, "아메리카노");
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
