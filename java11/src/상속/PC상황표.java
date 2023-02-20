package 상속;


public class PC상황표 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		카운트스레드 count = new 카운트스레드();
		타이머스레드 timer = new 타이머스레드();
		이미지스레드 image = new 이미지스레드();
		음식주문스레드 food = new 음식주문스레드();
		
		count.start(); // run()메서드 안에 정의된 내용이 동시에 실행됨.
		timer.start();
		image.start();
		food.start();
		
	}

}
