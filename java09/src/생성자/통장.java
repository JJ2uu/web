package 생성자;

public class 통장 {
	String name; // 이름
	String ssn; // 주민번호
	int money; // 돈
	
	// 생성자 (매개변수 있는 생성자)
	// 이름+주민번호 / 이름+주민번호+돈 2가리르 만들경우 이 2가지 경우 다 가능하다.
	//	public 통장(String name, String ssn) { // 이름과 주민번호만 있어도 생성된다.
	//
	//		this.name = name;
	//		this.ssn = ssn;
	//	}

	public 통장(String name, String ssn, int money) { //이름고 주민번호와 돈이 있어야 생성된다.
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}
	
	// 생성자에 적힌 값들을 전부 String으로 만들어서 출력해준다.
	@Override
	public String toString() {
		return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}
	
	
	
}
