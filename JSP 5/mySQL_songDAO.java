package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class mySQL_songDAO {
	
	// insert
	public int insert(mySQL_songVO bag) {
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL 자바 연결 객체 설계완료");
			
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공");
			
			String sql = "insert into music values(null, ?, ?, null, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTitle());
			ps.setString(2, bag.getArtist());
			ps.setString(3, bag.getImg());
			System.out.println("3. SQL문으로 만들기");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 보내기");
			if (result == 1) {
				System.out.println("등록 성공");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	
	// delete
	public int delete(int no) {
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL 자바 연결 객체 설계완료");
			
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공");
			
			String sql = "delete from music where no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			System.out.println("3. SQL문으로 만들기");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 보내기");
			if (result == 1) {
				System.out.println("삭제 성공");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	
	// hit_update
	public int hit_update(mySQL_songVO bag) {
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL 자바 연결 객체 설계완료");
			
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공");
			
			String sql = "update music set hit = ? where title = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bag.getHit());
			ps.setString(2, bag.getTitle());
			System.out.println("3. SQL문으로 만들기");
			
			result = ps.executeUpdate();
			System.out.println("4. SQL문 보내기");
			if (result == 1) {
				System.out.println("조회수 갱신 성공");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	
	// 하나 검색
	public mySQL_songVO one(String title) {
		ResultSet rs = null;
		mySQL_songVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL 자바 연결 객체 설계완료");
			
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공");
			
			String sql = "select * from music where title = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			System.out.println("3. SQL문으로 만들기");
			
			rs = ps.executeQuery();
			System.out.println("4.SQL문 보내기");
			if (rs.next()) {
				System.out.println("검색 결과 있음");
				bag = new mySQL_songVO();
				bag.setSong_id(rs.getInt("song_id"));
				bag.setTitle(rs.getString("title"));
				bag.setArtist(rs.getString("artist"));
				bag.setHit(rs.getInt("hit"));
				bag.setImg(rs.getString("img"));
			} else {
				System.out.println("검색 결과 없음");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(bag);
		return bag;
	}
	
	// 전체 리스트 검색
	public ArrayList<mySQL_songVO> list() {
		ResultSet rs = null;
		ArrayList<mySQL_songVO> list = new ArrayList<>();
		mySQL_songVO bag = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL 자바 연결 객체 설계완료");
			
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공");
			
			String sql = "select song_id, title, artist, hit, img from music";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문으로 만들기");
			
			rs = ps.executeQuery();
			System.out.println("4.SQL문 보내기");
			while (rs.next()) {
				System.out.println("검색 결과 있음");
				bag = new mySQL_songVO();
				bag.setSong_id(rs.getInt("song_id"));
				bag.setTitle(rs.getString("title"));
				bag.setArtist(rs.getString("artist"));
				bag.setHit(rs.getInt("hit"));
				bag.setImg(rs.getString("img"));
				
				list.add(bag);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(bag);
		return list;
	}
}
