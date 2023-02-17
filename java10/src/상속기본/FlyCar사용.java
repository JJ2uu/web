package 상속기본;

public class FlyCar사용 {

	public static void main(String[] args) {
		FlyCar flyCar = new FlyCar();
		
		flyCar.color = "흰색";
		flyCar.fly = true;
		flyCar.run();
		flyCar.fly();
		System.out.println(flyCar.color);
		System.out.println(flyCar.fly);
	}

}
