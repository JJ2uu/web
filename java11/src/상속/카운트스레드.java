package 상속;

public class 카운트스레드 extends Thread {
	
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운트>> " + i);
			// CPU에게 스레드를 실행 후 한 텀 재운다.
			// thread를 잠시 중지
			// CPU는 외부자원입니다.
			// 자바가 외부자원을 연결할 때는 위험신호 알려줘야한다.
			// 만약에 문제가 생기면 어떻게 처리할 지를 반드시 코딩
			try {
				Thread.sleep(2000); //2초 재운다.
			} catch (Exception e) {
				System.out.println("CPU 연결에 문제가 생겼습니다.");
			}
		}
	}
}
