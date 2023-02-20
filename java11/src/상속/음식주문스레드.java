package 상속;

import java.util.Random;

public class 음식주문스레드 extends Thread {

	public void run() {
		Random r = new Random(42);
		
		
		for (int i = 0; i < 100; i++) {
			int food = r.nextInt(100);
			System.out.println(food + "번 자리에서 상품을 주문했습니다.");
			
			try {
				Thread.sleep(5000); //2초 재운다.
			} catch (Exception e) {
				System.out.println("CPU 연결에 문제가 생겼습니다.");
			}
		}
	}

}
