package 인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		AppleComputer apple = new AppleComputer();
		SamsungComputer samsung = new SamsungComputer();
		apple.네모모양으로만들다();
		apple.전원을연결한다();
		apple.부품을산다();
		samsung.네모모양으로만들다();
		samsung.전원을연결한다();
		samsung.부품을산다();
	}

}
