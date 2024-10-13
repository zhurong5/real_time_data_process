package java20240715;

public class Ex05_Board { // 캡슐화
	// 캡슐화를 함으로써 멤버들을 은닉시킬수 있다.
	// 접근 지정자 : 엑세스를 할 수 있도록 하는 권한
	private int num; // 은닉
	private String subject;
	private String content;
	private String writer;
	
	public void setData(int num, String subject, 
			String content, String writer) {
		this.num = num;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	// setter : 은닉멤버를 엑세스하여 값을 저장하기 위해 사용
	public void setNum(int num) {
		this.num = num;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	// 반환형
	public int getNum() { // 피호출매서드
		return num; // return 은 호출매서드 쪽으로 값을 전달
	}
	// getter
	public String getSubject() {
		return subject;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	
	public void print() {
		System.out.println(num);
		System.out.println(subject);
		System.out.println(content);
		System.out.println(writer);
	}
}
