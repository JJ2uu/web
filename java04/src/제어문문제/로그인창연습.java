package 제어문문제;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인창연습 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(200, 500);
		f.getContentPane().setBackground(Color.white);
		
		Font font = new Font("Noto Sans CJK", 1, 20);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel text = new JLabel();
		text.setText("아이디");
		
		JLabel text2 = new JLabel();
		text2.setText("비밀번호");
		
		JTextField id = new JTextField(10);
		JTextField pw = new JTextField(10);
		
		JButton b = new JButton();
		b.setText("Login");
		b.setPreferredSize(new Dimension(170, 50));
		b.setBackground(Color.blue);
		b.setForeground(Color.white);
		
		
		JLabel text3 = new JLabel();
		text3.setText("");
		
		text.setFont(font);
		id.setFont(font);
		text2.setFont(font);
		pw.setFont(font);
		b.setFont(font);
		
		f.add(text);
		f.add(id);
		f.add(text2);
		f.add(pw);
		f.add(b);
		f.add(text3);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id2 = id.getText();
				String pw2 = pw.getText();
				if (id2.equals("root") && pw2.equals("1234")) {
					text3.setText("로그인 성공!");
				} else {
					text3.setText("로그인 실패");
				}
				
				
			}
		});
		
		f.setVisible(true);

	}

}
