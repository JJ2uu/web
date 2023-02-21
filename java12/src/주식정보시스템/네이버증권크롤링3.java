package 주식정보시스템;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링3 {

	public void naver(String code) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code);
//		System.out.println("1. 네트워크 연결 성공" + con);
		
		Document doc = null; // 로컬 변수 수동 초기화
		try {
			doc = con.get(); //html코드를 다 가져온다.
			Elements codeList = doc.select(".code"); // <a class="nav">
			Element tag = codeList.get(0);
			String code2 = tag.text();	
			System.out.println(code2);
			
			Elements todayList = doc.select("span.blind");
			Element tag4 = todayList.get(12);
			String today = tag4.text();
			System.out.println("현재가 " + today);
			

			Element tag5 = todayList.get(20);
			String low = tag5.text();
			System.out.println("최저가 " + low);
			

			Element tag6 = todayList.get(16);
			String high = tag6.text();
			System.out.println("최고가 " + high);
			
			FileWriter file = new FileWriter(code + ".txt");
			file.write(code2 + "\n");
			file.write(today + "\n");
			file.write(low + "\n");
			file.write(high + "\n");
			file.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
