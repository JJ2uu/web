package com.multi.mvc04;

public class MemberVO {
	// MemberVO 가방에 넣은 데이터는 member테이블에 들어갈 예정
	// 각 컬럼과 일치시켜 줌
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	// 가방에 하나씩 값을 넣어준다 ==> setter
	public void setId(String id) { 
		this.id = id;
	}
	
	// 가방에 하나씩 값을 꺼내주어야 함. ==> getter
	public String getId() {
		return id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	// 가방에 어떤 값들이 들어있는지 확인
	
	 @Override
	 public String toString() {
		 return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	 
	
	
	
}
