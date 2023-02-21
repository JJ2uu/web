package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 현대차증권크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005380");
		System.out.println("1. 네트워크 연결 성공" + con);
		
		Document doc = null; // 로컬 변수 수동 초기화
		try {
			doc = con.get(); //html코드를 다 가져온다.
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
			
			Elements todayList = doc.select("span.blind");
			System.out.println(todayList.size());
			System.out.println(todayList);
			System.out.println(todayList.get(12));
			for (int i = 0; i < todayList.size(); i++) {
				System.out.println(i + ": " + todayList.get(i));
			}
			Element tag4 = todayList.get(12);
			String today = tag4.text();
			System.out.println("현재가 " + today);
			
			System.out.println(todayList.get(20));
			Element tag5 = todayList.get(20);
			String low = tag5.text();
			System.out.println("최저가 " + low);
			
			System.out.println(todayList.get(16));
			Element tag6 = todayList.get(16);
			String high = tag6.text();
			System.out.println("최고가 " + high);
			
			Elements close = doc.select(".date");
			System.out.println(close.size());
			System.out.println(close);
			System.out.println(close.get(0));
			Element tag7 = close.get(0);
			String close2 = tag7.text();
			System.out.println(close2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
