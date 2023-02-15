package 생성자맛보기;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 겨울철음식2 {
	
	static int count;
	static int count2;
	static int count3;
	static int pay;
	static int pay2;
	static int pay3;
	final static int PRICE = 1000; // final은 변경불가
	final static int PRICE2 = 500; // final은 변경불가
	final static int PRICE3 = 2000; // final은 변경불가

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
		
		JButton b1 = new JButton("붕어빵 1000원");
		b1.setPreferredSize(new Dimension(180, 50));
		b1.setBackground(new Color(0, 153, 255));
		b1.setForeground(Color.white);
		b1.setBorderPainted(false);
		b1.setFont(font);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("winter1.jpg");
				img2.setIcon(icon);
				count++;
				countLabel.setText("총 수량: " + (count + count2 + count3) + "개");
				pay = PRICE * count;
				priceResult.setText("총 결제금액: "+ (pay + pay2 + pay3) + "원");
				f.setTitle("붕어빵: " + count + "개   계란빵: " + count2 + "개   호빵: " + count3 + "개");
			}
		});
		
		JButton b2 = new JButton("계란빵 500원");
		b2.setPreferredSize(new Dimension(180, 50));
		b2.setBackground(new Color(255, 153, 0));
		b2.setForeground(Color.white);
		b2.setBorderPainted(false);
		b2.setFont(font);
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("winter2.jpg");
				img2.setIcon(icon);
				count2++;
				countLabel.setText("총 수량: " + (count + count2 + count3) + "개");
				pay2 = PRICE2 * count2;
				priceResult.setText("총 결제금액: " + (pay + pay2 + pay3) + "원");
				f.setTitle("붕어빵: " + count + "개   계란빵: " + count2 + "개   호빵: " + count3 + "개");
			}
		});
		
		JButton b3 = new JButton("호빵 2000원");
		b3.setPreferredSize(new Dimension(150, 50));
		b3.setBackground(new Color(153, 102, 255));
		b3.setForeground(Color.white);
		b3.setBorderPainted(false);
		b3.setFont(font);

		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("winter3.png");
				img2.setIcon(icon);
				count3++;
				countLabel.setText("총 수량: " + (count + count2 + count3) + "개");
				pay3 = PRICE3 * count3;
				priceResult.setText("총 결제금액: " + (pay + pay2 + pay3) + "원");
				f.setTitle("붕어빵: " + count + "개   계란빵: " + count2 + "개   호빵: " + count3 + "개");
			}
		});
		
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(img2);
		f.add(countLabel);
		f.add(priceResult);
		
		f.setVisible(true);
		
	}

}
