package 상속응용;

// 동시에 실행시키고 싶은 부품인 Thread로 만들어주세요.
public class 감소스레드 extends Thread {
	
	// CPU가 동시에 실행할 내용을 run()메서드 안에 넣어준다.
	@Override
	public void run() {
		for (int i = 100; i > 0; i--) {
			System.out.println("감소>> " + i);
		}
	}

}
