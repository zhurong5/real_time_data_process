package java20240715;

public class Ex10_QnA {
	// setter/getter , 생성자
	// 객체생성시 생성자를 이용하고 생성한 후 setter를 이용해서 멤버값을 변경하고
	// getter를 이용해서 맴버값을 출력

	int inquireNum;
	String inquireKind;
	String inquireSubject;
	String inquireContent;
	String inquireDate;
	String inquireAnswer;
	String inquireAnswerDate;

	public Ex10_QnA(int inquireNum, String inquireKind, String inquireSubject, String inquireContent, String inquireDate,
			String inquireAnswer, String inquireAnswerDate) {
		this.inquireNum = inquireNum;
		this.inquireKind = inquireKind;
		this.inquireSubject = inquireSubject;
		this.inquireContent = inquireContent;
		this.inquireDate = inquireDate;
		this.inquireAnswer = inquireAnswer;
		this.inquireAnswerDate = inquireAnswerDate;
	}

	//setter
	public void setInquireNum(int inquireNum) {
		this.inquireNum = inquireNum;
	}

	public void setInquireKind(String inquireKind) {
		this.inquireKind = inquireKind;
	}

	public void setInquireSubject(String inquireSubject) {
		this.inquireSubject = inquireSubject;
	}

	public void setInquireContent(String inquireContent) {
		this.inquireContent = inquireContent;
	}

	public void setInquireDate(String inquireDate) {
		this.inquireDate = inquireDate;
	}

	public void setInquireAnswer(String inquireAnswer) {
		this.inquireAnswer = inquireAnswer;
	}

	public void setInquireAnswerDate(String inquireAnswerDate) {
		this.inquireAnswerDate = inquireAnswerDate;
	}

	// getter
	public int getInquireNum() {
		return inquireNum;
	}

	public String getInquireKind() {
		return inquireKind;
	}

	public String getInquireSubject() {
		return inquireSubject;
	}

	public String getInquireContent() {
		return inquireContent;
	}

	public String getInquireDate() {
		return inquireDate;
	}

	public String getInquireAnswer() {
		return inquireAnswer;
	}

	public String getInquireAnswerDate() {
		return inquireAnswerDate;
	}

}
