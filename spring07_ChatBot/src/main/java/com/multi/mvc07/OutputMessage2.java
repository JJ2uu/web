package com.multi.mvc07;

// 서버에서 받은 데이터를 채팅창에 들어와 있는 멤버 브라우저에게 보낼 데이터를 넣을 VO >> messageBroker가 json으로 만들어서 브라우저에 보낸다.
// @sendTo("topic/messages2")
public class OutputMessage2 {
	
	private String from;
	private String text;
	private String menu;
	
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "OutputMessage2 [from=" + from + ", text=" + text + ", menu=" + menu + "]";
	}


	
}