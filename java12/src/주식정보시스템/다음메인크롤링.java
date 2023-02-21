package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 다음메인크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://comic.naver.com/index");
		System.out.println("1. 네트워크 연결 성공" + con);
		
		Document doc = null; // 로컬 변수 수동 초기화
		try {
			doc = con.get();
			Elements list = doc.select(".menu a"); // <a class="nav">
			System.out.println(list.size()); // list 크기
			Element tag = list.get(2);
			System.out.println(tag.text());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
