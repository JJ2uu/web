package 생성자맛보기;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 겨울철음식3 {
	

	final static int[] PRICE = {1000, 500, 2000}; // 가격 배열
	static int[] count = new int[4]; // 카운트 배열
	static int[] pay = new int[3]; // 각 음식 별 총가격 배열
	static String[] menu = {"붕어빵", "계란빵", "호빵"};
	static String[] icons = {"winter1.jpg", "winter2.jpg", "winter3.png"};
	static JButton[] buttons = new JButton[3]; // 버튼배열

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(600, 450);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("NanumGothic", Font.BOLD, 20);
		
		JLabel img2 = new JLabel();
		ImageIcon icon = new ImageIcon("girl.jpg");
		img2.setPreferredSize(new Dimension(550, 300));
		img2.setIcon(icon);
		
		JLabel countLabel = new JLabel("총 수량: ", JLabel.LEFT);
		countLabel.setPreferredSize(new Dimension(225, 20));
		countLabel.setFont(font);
	
		JLabel priceResult = new JLabel("총 결제금액: ", JLabel.RIGHT);
		priceResult.setPreferredSize(new Dimension(225, 20));
		priceResult.setFont(font);
		
		for (int i = 0; i < menu.length; i++) {
			buttons[i] = new JButton(menu[i] + PRICE[i] +"원");
			buttons[i].setBackground(new Color(0, 153, 255));
			buttons[i].setForeground(Color.white);
			buttons[i].setBorderPainted(false);
			buttons[i].setFont(font);
			f.add(buttons[i]);
			
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String name = e.getActionCommand();
					System.out.println(name);
					int index = 0; //
					if(name.equals("짬뽕")) {
						index = 1; //짬뽕
					}else if (name.equals("우동")) {
						index = 2; //우동
					}else{
						index = 3; //짜장
					}
					ImageIcon icon = new ImageIcon(icons[index - 1]);
					img2.setIcon(icon);
					count[0]++;
					countLabel.setText(count[0] + "개");
					count[index]++;
					f.setTitle("붕어빵: " +	count[1] + "개, 계란빵: " + 
										count[2] + "개, 호빵: " + 
										count[3] + "개");
					int total = 0;
					for (int j = 1; j < count.length; j++) {
						System.out.println(count[j] * PRICE[j]);
						total = total + (count[j] * PRICE[j]);
					}
					priceResult.setText("결제금액 " + total + "원");
				}
			});
		}
		
		f.add(img2);
		f.add(countLabel);
		f.add(priceResult);
		
		f.setVisible(true);
		
	}

}
