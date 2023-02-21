package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링 {

	public static void main(String[] args) {
		// 크롤링은 인터넷 문서(html)를 다 받아와서,
		// html문서를 분석(parser, 파싱)을 해서 내가 원하는 정보를 추출하는 것
		Connection con = Jsoup.connect("http://www.naver.com");
		System.out.println("1. 네트워크 연결 성공" + con);
		
		Document doc = null; // 로컬 변수 수동 초기화
		try {
			doc = con.get();
			Elements list = doc.select(".nav"); // <a class="nav">
			// 클래스가 nav인 태그를 다 가지고 와서 ArrayList를 상속받은 Elements에 자동으로 넣어준다.
			// [Element, Element, Element(tag), ...]
			System.out.println(list.size()); // list 크기
			// System.out.println(list);
			for (int i = 0; i < list.size(); i++) {
				Element tag1 = list.get(i); // [Element[0]]
				// System.out.println(tag1);
				String text1 = tag1.text(); //<a class="nav">메일</a> 
				System.out.println(text1);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(doc);
		
		
		
		
	}

}
