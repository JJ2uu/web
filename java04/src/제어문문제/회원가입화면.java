package 제어문문제;

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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 회원가입화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(280, 500);
		f.getContentPane().setBackground(Color.white);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("Noto Sans CJK", 1, 20);
		Font font2 = new Font("Noto Sans CJK", 1, 15);
		
		ImageIcon icon2 = new ImageIcon("naver.jpg");
		
		JLabel icon = new JLabel(icon2);
		JLabel text1 = new JLabel("아이디 생성");
		JLabel text2 = new JLabel("비밀번호 생성");
		JLabel text3 = new JLabel("이름");
		JLabel text4 = new JLabel("전화번호");
		
		JTextField id = new JTextField(15);
		JTextField pw = new JTextField(15);
		JTextField name = new JTextField(15);
		JTextField phone = new JTextField(15);
		
		
		JButton b = new JButton("회원가입");
		b.setPreferredSize(new Dimension(255, 50));
		b.setBackground(Color.GREEN);
		
		text1.setFont(font2);
		text2.setFont(font2);
		text3.setFont(font2);
		text4.setFont(font2);
		
		id.setFont(font);
		pw.setFont(font);
		name.setFont(font);
		phone.setFont(font);
		
		
		f.add(icon);
		f.add(text1);
		f.add(id);
		f.add(text2);
		f.add(pw);
		f.add(text3);
		f.add(name);
		f.add(text4);
		f.add(phone);
		f.add(b);
		
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id2 = id.getText();
				String pw2 = pw.getText();
				String name2 = name.getText();
				String phone2 = phone.getText();
				
				JOptionPane.showMessageDialog(f, "아이디: " + id2 + "\n" + "비밀번호: " + pw2 + "\n" + "이름: " + name2 + "\n" + "전화번호: " + phone2 + "\n");
			}
		});
		
		f.setVisible(true);

	}

}
