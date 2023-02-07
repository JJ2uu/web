package 순차문;

import javax.swing.JOptionPane;

public class 순차문연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력
		String height = JOptionPane.showInputDialog("당신의 키(cm)를 입력하세요.");
		String weight = JOptionPane.showInputDialog("당신의 체중은 몇 kg 입니까?");
		
		double height2 = Double.parseDouble(height);
		double weight2 = Double.parseDouble(weight);
		
		//처리
		double result = (height2 - weight2) * 0.9;
		
		
		//출력
		System.out.println("당신의 BMI지수는 "+ result + "입니다.");
		JOptionPane.showMessageDialog(null, result);
		
	}

}
