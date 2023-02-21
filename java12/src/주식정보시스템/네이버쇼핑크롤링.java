package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버쇼핑크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://shopping.naver.com/home");
		System.out.println("1. 네트워크 연결 성공" + con);
		
		Document doc = null; // 로컬 변수 수동 초기화
		try {
			doc = con.get();
			Elements list = doc.select("._lnb_text_3f3tB"); // <a class="nav">
			System.out.println(list.size()); // list 크기
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				System.out.println(tag.text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
