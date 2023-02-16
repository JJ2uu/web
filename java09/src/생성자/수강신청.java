package 생성자;

public class 수강신청 {
	public String subject; //과목
	public String time; //시간
	public String name; //이름
	
	public 수강신청(String subject, String time, String name) {
		this.subject = subject;
		this.time = time;
		this.name = name;
	}

	@Override
	public String toString() {
		return "수강신청 [신청과목=" + subject + ", 수강시간=" + time + ", 수강생이름=" + name + "]";
	}

	
}
