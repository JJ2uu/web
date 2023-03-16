package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;


public class mySQL_bbsDAO { //CRUD

	//메서드를 만드는 것 ==> 메서드 정의(define)!
	//메서드를 정의했다고 실행되는 것은 아니다.!
	//메서드를 쓰는 것 ==> 메서드 호출(call)!
	public int delete(int no) {
		int result = 0;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공.");

			String sql = "delete from bbs where no = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setInt(1, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			result = ps.executeUpdate(); 
			System.out.println("4. SQL문 mySQL로 보내기 성공.");
			if(result == 1) {
				System.out.println("탈퇴 성공.");
			}
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public mySQL_bbsVO one(int no) {
		// ResultSet > 기본형 데이터만 값으로 초기화, 참조형은 주소가 들어가 있어 null로 초기화
		ResultSet rs = null; // 컬럼명 + 결과 데이터를 담고 있는 테이블
		mySQL_bbsVO bag = null;
		
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from bbs where no = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setInt(1, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery();
			System.out.println("4. SQL문 mySQL로 보내기 성공.");
			if(rs.next()) { // 검색 결과가 있는이 여부는 rs.next(). true 이면 있다. false이면 없다.
				System.out.println("검색 결과 있음");
				int no2 = rs.getInt(1);
				String title2 = rs.getString(2);
				String content2 = rs.getString(3);
				String writer2 = rs.getString(4);
				System.out.println(no2 + " " + title2 + " " + content2 + " " + writer2);
				bag = new mySQL_bbsVO();
				bag.setNo(no2);
				bag.setTitle(title2);
				bag.setContent(content2);
				bag.setWriter(writer2);
			} else {
				System.out.println("검색 결과 없음");
			}
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bag;
		
	}
	
	public int update(mySQL_bbsVO bag) {
		int result = 0;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공.");
			
			String sql = "update bbs set content = ? where no = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setString(1, bag.getContent());
			ps.setInt(2, bag.getNo());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			result = ps.executeUpdate(); 
			//insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 mySQL로 보내기 성공.");
			if(result == 1) {
				System.out.println("수정 성공.");
			}
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//public void add2() {
	public int insert(mySQL_bbsVO bag) {
		int result = 0;
		
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공.");

			String sql = "insert into bbs(title, content, writer) values (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTitle());
			ps.setString(2, bag.getContent());
			ps.setString(3, bag.getWriter());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			result = ps.executeUpdate(); //1
			System.out.println("4. SQL문 mySQL로 보내기 성공.");
			if(result == 1) {
				System.out.println("회원가입 성공!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	
	public ArrayList<mySQL_bbsVO> list() {
		ResultSet rs = null;
		ArrayList<mySQL_bbsVO> list = new ArrayList<>();	
		mySQL_bbsVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from bbs";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery(); //select문 전송시  
			System.out.println("4. SQL문 mySQL로 보내기 성공.");
			while(rs.next()) { //검색결과가 있는지 여부는 rs.next() 
				System.out.println("검색결과 있음. 성공.");
				int no2 = rs.getInt(1);
				String title2 = rs.getString(2);
				String content2 = rs.getString(3); //name
				String writer2 = rs.getString(4); //tel
				System.out.println(	no2 + " " + title2 + " " + content2 + " " + writer2);
				bag = new mySQL_bbsVO();
				bag.setNo(no2);
				bag.setTitle(title2);
				bag.setContent(content2);
				bag.setWriter(writer2);

				list.add(bag);
			}
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}