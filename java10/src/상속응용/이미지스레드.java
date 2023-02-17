package 상속응용;

public class 이미지스레드 extends Thread {
	
	public void run() {
		
		String[] images = {
				"1.png", "2.png", "3.png", "4.png", "5.png",
				"1.png", "2.png", "3.png", "4.png", "5.png",
				"1.png", "2.png", "3.png", "4.png", "5.png",
				"1.png", "2.png", "3.png", "4.png", "5.png"
		};
		
		for (int i = 0; i < images.length; i++) {
			System.out.println("이미지>> " + images[i]);
			try {
				Thread.sleep(5000); //2초 재운다. 컴퓨터에서의 1초는 1초를 1000으로 나눴다. ms(밀리세컨즈)
			} catch (Exception e) {
				System.out.println("CPU 연결에 문제가 생겼습니다.");
			}
		}
	}
}
