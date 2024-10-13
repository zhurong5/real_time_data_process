package java20240715;

public class Ex04_Board {
	int num;
	String subject;
	String content;
	String writer;

	public void setData(int num, String subject, 
			String content, String writer) {
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
