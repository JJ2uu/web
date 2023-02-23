package 인터페이스;

public class AppleComputer implements ComputerInterface {

	@Override
	public void 네모모양으로만들다() {
		// TODO Auto-generated method stub
		System.out.println("직사각형으로 만들다.");
	}

	@Override
	public void 전원을연결한다() {
		// TODO Auto-generated method stub
		System.out.println("하얀색 줄로 전원을 연결한다.");
	}

	@Override
	public void 부품을산다() {
		// TODO Auto-generated method stub
		System.out.println("MAC을 사면 마우스, 키보드를 세트로 준다.");
	}

}
