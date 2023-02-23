package 인터페이스;

public class SamsungComputer implements ComputerInterface {

	@Override
	public void 네모모양으로만들다() {
		// TODO Auto-generated method stub
		System.out.println("직사각형으로 만든다.");
	}

	@Override
	public void 전원을연결한다() {
		// TODO Auto-generated method stub
		System.out.println("검은색 줄로 전원을 연결한다.");
	}

	@Override
	public void 부품을산다() {
		// TODO Auto-generated method stub
		System.out.println("마우스, 모니터 등등 여러가지 부품을 산다.");
	}

}
