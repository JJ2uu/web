package com.multi.mongoDB;

public class MemoVO {
	private String name;
	private Integer age;
	private String office;
	private String tel;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "MemoVO [name=" + name + ", age=" + age + ", office=" + office + ", tel=" + tel + ", phone=" + phone
				+ "]";
	}
	
	
}
