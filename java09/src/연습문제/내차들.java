package 연습문제;

public class 내차들 {

	public static void main(String[] args) {
		CoffeeTruck 커피트럭 = new CoffeeTruck();
		커피트럭.type = "트럭";
		커피트럭.color = "검정";
		커피트럭.price = 100000000;
		커피트럭.wheel = 4;
		System.out.println(커피트럭);
		커피트럭.run();
		커피트럭.coffee();
		커피트럭.transform();
		커피트럭.dessert();
	}

}
