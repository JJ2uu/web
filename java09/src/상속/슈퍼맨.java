package 상속;

public class 슈퍼맨 extends 맨 {
	boolean fly;
	
	public void space() {
		sleep(); // 상속받아서 슈퍼맨꺼가 되었고, 자기껀 자기가 그냥 쓸 수 있음
		System.out.println("이름은 " + name);
		System.out.println("우주를 날다");
	}
	
	@Override
	public void eat() {
		System.out.println("많이 먹다."); //Override 된 애가 실행
	}

	@Override
	public String toString() {
		return "슈퍼맨 [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
