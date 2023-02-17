package 상속응용;

public class 동시프로그램 {

	public static void main(String[] args) {
		달러스레드 d2 = new 달러스레드();
		골뱅이스레드 g2 = new 골뱅이스레드();
		앤드스레드 a2 = new 앤드스레드();
		
		d2.start();
		g2.start();
		a2.start();
	}

}
