package java20240716;

public class Ex01_Calculator {
	// 멤버 필드 초기화 시키지 않으면 정수 0, 실수 0.0, 부을 false, 문자열 null ,문자 blank
	private int first = 10;
	private int second = 20;
	private int result;
	char ch;

	public Ex01_Calculator() {
	}

	public Ex01_Calculator(int first, int second) {
		this.first = first;
		this.second = second;
	}

	public void add() {
		result = first + second;
	}

	public void print() {
		System.out.println(first);
		System.out.println(second);
		System.out.println(result);
		System.out.println(ch);
	}
}
