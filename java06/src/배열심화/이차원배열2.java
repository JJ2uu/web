package 배열심화;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원배열2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		String[] header = {"컴퓨터", "영어", "수학", "체육"};
		String[][] contents = {
				//열
				{"100", "88", "99", "77"}, //행
				{"60", "87", "79", "78"},
				{"90", "83", "89", "79"},
				{"100", "88", "99", "77"},
				{"60", "87", "79", "78"},
				{"90", "83", "89", "79"},
				{"100", "88", "99", "77"},
				{"60", "87", "79", "78"},
				{"90", "83", "89", "79"},
				{"100", "88", "99", "77"},
				{"60", "87", "79", "78"},
				{"90", "83", "89", "79"},
				{"100", "88", "99", "77"},
				{"60", "87", "79", "78"},
				{"90", "83", "89", "79"},
				{"100", "88", "99", "77"},
				{"60", "87", "79", "78"},
				{"90", "83", "89", "79"}
		};
		
		JTable table = new JTable(contents, header); // table은 제목변수, 내용변수가 꼭 있어야 생성됨.
		table.setRowHeight(25);
		JScrollPane scroll = new JScrollPane(table);
		
		f.add(scroll);
		f.setVisible(true);
	}

}
