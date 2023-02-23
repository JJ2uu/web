package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class 글자길이판독기 extends JFrame {
	
	public static void main(String[] args) {
		글자길이판독기 f = new 글자길이판독기();
	}
	
	public 글자길이판독기() {
		setSize(400, 320);
		setTitle("글자/단어 길이 판독기");
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.white);
		
		Font font = new Font("NanumGothic", Font.BOLD, 20);
		Font font2 = new Font("NanumGothic", Font.BOLD, 16);
		
		JLabel w = new JLabel("문장을 넣으세요");
		w.setFont(font);
		
		JTextArea text = new JTextArea(10, 25);
		text.setBackground(Color.DARK_GRAY);
		text.setForeground(Color.white);
		text.setFont(font2);
		
		JButton b1 = new JButton("Click");
		JButton b2 = new JButton("Pad Color");
		JButton b3 = new JButton("Text Color");
		b1.setFont(font);
		b1.setBackground(Color.lightGray);
		b2.setFont(font);
		b2.setBackground(Color.lightGray);
		b3.setFont(font);
		b3.setBackground(Color.lightGray);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String textGet = text.getText();
				JOptionPane.showMessageDialog(text, "글자수는 " + textGet.length());
				text.setText("");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String color = JOptionPane.showInputDialog(text, "어떤 색으로 바꿀까요?\n 1)흰색 2)파란색 3)노란색 ");
				if (color.equals("1")) {
					text.setBackground(Color.white);
				} else if (color.equals("2")) {
					text.setBackground(Color.blue);
				} else if (color.equals("3")) {
					text.setBackground(Color.yellow);
				} else {
					text.setBackground(Color.darkGray);
				}
			}
		});
		
		
		
		b3.addActionListener(new ActionListener() {
			
			Random random = new Random();
			@Override
			public void actionPerformed(ActionEvent e) {
				int r = random.nextInt(256);
				int g = random.nextInt(256);
				int b = random.nextInt(256);
				
				text.setForeground(new Color(r, g, b));
			}
		});
	
		
		add(w);
		add(text);
		add(b1);
		add(b2);
		add(b3);
		
		setVisible(true);
	}

}
