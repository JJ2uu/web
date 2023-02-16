package 생성자;

public class TV {
	// 멤버변수, 클래스 바로 아래에 선언되었기 때문에 클래스 전체 영역에서 이 변수를 사용할 수 있음
	// 전역변수(global변수, 글로벌변수)
	// 멤버변수는 자동초기화 (==전역 변수는 자동초기화)
	public int ch; // 0
	public int vol; //0
	public boolean onOff; // false로 초기화
	
	// 다른 생성자 메서드가 없으면 부품만들 때(객체생성) 자동으로 생성된다.
	// 기본 생성자(default constructor)
	//	public TV() {
	//		// 자동으로 만등러지는 메서드(함수)
	//		// return값이 없으므로 무조건 void
	//		System.out.println("TV객체가 하나 생성됨");
	//	}
	
	// 객체를 생성할 때마다 꼭 실행시키고자 하는 내용이 있으면 기본 생성자를 명시적으로 다시 만들어준다.
	// Class 이름과 동일해야 자동 호출
	public TV() {
		// Source => Generate Constructors from superclass. (파라매터 없는 기본 생성자)
		System.out.println("TV객체가 하나 생성됨");
	}
	
	//	public TV(int ch, int vol, boolean onOff) { //매개변수(파라메터)가 있는 생성자
	//		// 무더기 영역(힙영역)에 저장된 멤버변수에 값을 넣어주는 역할
	//		// 구분이 쉽도록 변수 이름을 똑같이 해주지만
	//		// this.를 적어주지 않으면 맨 위에 있는 전역변수까지 가지 않고 지역변수로 인식하게 된다.
	//		this.ch = ch;
	//		this.vol = vol;
	//		this.onOff = onOff;
	//	}
	
	public TV(int ch, int vol, boolean onOff) {
		// Generate Constructor using Field // 파라매터 있는 기본 생성자
		// 파라메터 있는 기본 생성자가 있을 경우 파라메터 없는 기본 생성자는 자동생성 되지 않음.
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}
	
	public void 채널을바꾸다() {
		int change = 1; // 지역변수(local변수, 로컬변수, 자동초기화X)
		System.out.println(ch + "에서 " + change + "로 바꾸다.");
	}
	

	public void 유튜브보다() { // 메서드를 만드는 것 => 메서드(기능)를 정의한다.
		System.out.println(vol + "을 키워서 동영상을 보다"); // 정의하다.
	}
	
	
	
}
