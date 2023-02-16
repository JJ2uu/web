package 스태틱;

public class 직원 {
	String name; //이름
	int age; //나이
	String gender; //성별
	
	static int count; //직원 수  카운트
	static int ageTotal; //나이 합
	
	public static void getAvg() {
//		System.out.println(name);
// 		=> 오류가 나는 이유 : static 메서드에서 전역변수를 접근할 때는 같은 성격ㅇ르 가진 static변수만 접근이 가능
//						 아래의 ageTotal / count는 같은 static변수로 객체생성 없이 클래스이름만으로 사용이 가능하지만
//                       name은 무더기영역에 있는 변수로 객체생성이 필요하기 때문에 오류가 난다.
		
		System.out.println(ageTotal / count);
	}
	
	public 직원(String name, int age, String gender) {
		count++;
		ageTotal += age;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "직원정보 [이름: " + name + ", 나이: " + age + ", 성별" + gender + "]";
	}
	
	
	
}
