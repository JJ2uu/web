package 상속기본;

public class 볼펜사용 {

	public static void main(String[] args) {
		볼펜 bp = new 볼펜();
		bp.price = 2000;
		bp.company = "모나미";
		bp.thickness = "두껍다";
		System.out.println(bp);
		
		bp.buy();
		bp.write();
	}

}
