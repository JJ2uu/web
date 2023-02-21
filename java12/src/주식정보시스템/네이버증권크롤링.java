package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		System.out.println("1. 네트워크 연결 성공" + con);
		
		Document doc = null; // 로컬 변수 수동 초기화
		try {
			doc = con.get();
			Elements codeList = doc.select(".code"); // <a class="nav">
			System.out.println(codeList.size()); // list 크기
			Element tag = codeList.get(0);
			String code = tag.text();	
			System.out.println(code);
			
			Elements textList = doc.select(".sptxt.sp_txt9"); // <a class="nav">
			System.out.println(textList.size()); // list 크기
			Element tag2 = textList.get(0);
			String text1 = tag2.text();
			System.out.println(text1);
			
			Elements textList2 = doc.select(".sptxt.sp_txt10"); // <a class="nav">
			System.out.println(textList2.size()); // list 크기
			Element tag3 = textList2.get(0);
			String text2 = tag3.text();
			System.out.println(text2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
