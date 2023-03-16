package multi;

public class mySQL_bbsVO {
	// MemberVO 가방에 넣은 데이터는 member테이블에 들어갈 예정
	// 각 컬럼과 일치시켜 줌
	private int no;
	private String title;
	private String content;
	private String writer;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "mySQL_bbsVO [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
}
