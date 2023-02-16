package 연습문제;

public class 딸 {
	String name; //이름
	String gender; //성별
	
	static int father = 10000;
	static int count; //딸 카운트

	public 딸(String name, String gender) {
		count++;
		father -= 1000;
		this.name = name;
		this.gender = gender;
	}
	
	public void TV보다() {
		System.out.println("아빠와 딸이 TV를 본다.");
	}

	@Override
	public String toString() {
		return "딸 이름: " + name + "(" + gender + ")";
	}
	
	
}
