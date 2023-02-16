package 상속;

public class 맨 extends 사람{
	// 사람을 상속받았기 때문에
	// Object의 것들
	// name, age
	// eat(), sleep() 이 존재한다.
	int power;
	
	public void run() {
		System.out.println("빨리달리다.");
	}
}
