package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {
		byte b1 = 100; // 1바이트, -128~127
		int i1 = 200; // 4바이트, -21억~21억
		
		i1 = b1; // 큰 <- 작 (b1의 타입이 int로 자동형변환)
		
		b1 = (byte)i1; // 작 <- 큰 (i1의 타입을 byte로 강제형변환)
		double d1 = i1;
		i1 = (int)d1;
		
		int i2 = 2000;
		byte b2 = (byte)i2; //byte의 범위를 넘어선 127이상의 숫자는 강제형변환 하지 말아야 함
	}

}
