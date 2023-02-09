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

public class 인기투표문제2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 805);
		f.getContentPane().setBackground(Color.white);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font1 = new Font("Noto Sans CJK", 1, 30); // 메인 타이틀 폰트
		Font font2 = new Font("Noto Sans CJK", 1, 15); // 소메뉴 폰트
		Font font3 = new Font("Noto Sans CJK", 1, 25); // 투표수 폰트
		
		
		JLabel title = new JLabel("K-POP 인기 투표");
		JLabel iuTitle = new JLabel("1. 아이유 - Love poem");
		JLabel iuResult = new JLabel("0표");
		JLabel njsTitle = new JLabel("2. NewJeans - Attention");
		JLabel njsResult = new JLabel("0표");
		JLabel nmxTitle = new JLabel("3. NMIXX - O.O");
		JLabel nmxResult = new JLabel("0표");
		
		ImageIcon iuIcon = new ImageIcon("iu.jpg");
		ImageIcon njsIcon = new ImageIcon("njs.jpg");
		ImageIcon nmxIcon = new ImageIcon("nmx.jpg");
		
		JButton b1 = new JButton(iuIcon); //iu button
		b1.setBackground(Color.white);
		b1.setBorderPainted(false); // 버튼 테두리 X
		JButton b2 = new JButton(njsIcon); //njs button
		b2.setBackground(Color.white);
		b2.setBorderPainted(false); 
		JButton b3 = new JButton(nmxIcon); // nmx button
		b3.setBackground(Color.white);
		b3.setBorderPainted(false);
		JButton b4 = new JButton("투표종료");
		b4.setPreferredSize(new Dimension(280, 40));
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		b4.setBorderPainted(false);
		
		title.setFont(font1);
		iuTitle.setFont(font2);
		iuResult.setFont(font3);
		njsTitle.setFont(font2);
		njsResult.setFont(font3);
		nmxTitle.setFont(font2);
		nmxResult.setFont(font3);

		f.add(title);
		f.add(b1);
		f.add(iuTitle);
		f.add(iuResult);
		f.add(b2);
		f.add(njsTitle);
		f.add(njsResult);
		f.add(b3);
		f.add(nmxTitle);
		f.add(nmxResult);
		f.add(b4);

		
		b1.addActionListener(new ActionListener() {
			int iu = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
			iu++;
			iuResult.setText(iu + "표");
			}
		});
		b2.addActionListener(new ActionListener() {
			int njs = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				njs++;
				njsResult.setText(njs + "표");
			}
		});
		b3.addActionListener(new ActionListener() {
			int nmx = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				nmx++;
				nmxResult.setText(nmx + "표");
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(f, "투표를 종료합니다.");
			}
		});
		f.setVisible(true);
	}

}
