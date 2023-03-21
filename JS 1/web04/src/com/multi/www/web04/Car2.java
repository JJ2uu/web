package com.multi.www.web04;

public class Car2 {
	String color;
	int price;
	int speed;
	public static Car2 car2; // 하나만 제공하는 객체는 public static 변수로 선언해줘야함
	
	/* 싱글톤은 해당클래스에서 하나만 만들어서 제공
	 * => public -> private
	 */
	public static Car2 getInstance() {
		if (car2 == null) {
			car2 = new Car2("빨강", 100, 110); // car2가 null일때만 car2 객체를 만들게끔
		}
		return car2; // null이 아니면 바로 리턴하게끔
	}
	
	public void run() {
		System.out.println("달리자.");
	}
	
	private Car2(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}

	
	
	
	
}
