package 생성자;

public class 게시판글쓰기 {

	public static void main(String[] args) {
		게시판제목 글쓰기 = new 게시판제목(1, "자바", "오늘은 생성자 하는 날", "홍길동");
		System.out.println(글쓰기);
		게시판제목 글쓰기2 = new 게시판제목(2, "JSP", "오늘은 웹프로그램 하는 날", "홍길동");
		System.out.println(글쓰기2);
		게시판제목 글쓰기3 = new 게시판제목(3, "Spring", "오늘은 실무 웹프로그램 하는 날", "홍길동");
		System.out.println(글쓰기3);
	}

}
