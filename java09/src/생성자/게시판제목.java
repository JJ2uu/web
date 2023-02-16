package 생성자;

public class 게시판제목 {
	int no;
	String title;
	String content;
	String writer;
	
	public 게시판제목(int no, String title, String content, String writer) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "게시판제목 [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
}
