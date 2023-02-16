package 상속;

public class 영웅사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		p.name = "홍길동";
		p.age = 100;
		System.out.println(p);
		p.eat();
		
		맨 m = new 맨();
		m.run();
		
		슈퍼맨 superMan = new 슈퍼맨();
		superMan.name = "클라크";
		superMan.age = 25000;
		superMan.fly = true;
		superMan.power = 50000;
		superMan.eat();
		superMan.run();
		superMan.space();
		
		System.out.println("---------------------------------");
		
		원더우먼 w = new 원더우먼();
		w.name = "다이애나";
		w.age = 30000;
		w.fly = true;
		w.gender = "여";
		w.information();
		w.beauty();
		w.ability();
		w.vs();
	}

}
