package 순차문;

// 부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본 순차문 : 입력 > 처리 > 출력
		
		// 입력 [부품 사용, 언제나 바로 사용할 수 있는 것]
		String data1 = JOptionPane.showInputDialog("정수를 입력하시오-1");
		String data2 = JOptionPane.showInputDialog("정수를 입력하시오-2");
		
		// 처리 [숫자계산]
		// String > int
		int data11 = Integer.parseInt(data1);
		int data22 = Integer.parseInt(data2);
		int result = data11 + data22; // 결과는 String
		
		double data33 = Double.parseDouble(data1);
		double data44 = Double.parseDouble(data2);
		double result2 = data33 + data44;
		
		// 출력 [모니터 화면에 보이게 하는 것]
		System.out.println(result);
		System.out.println(result2);
	}

}
