package java20240715;

public class Ex07_Board {
	
	// 생성자 : 객체가 생성이 될 때 자동으로 실행되는 매서드
	// 오버로딩 : 매서드의 이름이 같을 때
	int num;
	String subject;
	String content;
	String writer;
	public Ex07_Board() {} // 기본생성자(default 생성자) : 정의하지 않아도 존재하는 생성자
	// 기본 생성자는 생성자를 정의하면 자동으로 만들어지지 않는다.
	public Ex07_Board(int num, String subject, String content , String writer) {
		this.num = num;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	public void print() {
		System.out.println(num);
		System.out.println(subject);
		System.out.println(content);
		System.out.println(writer);
	}
}
