package java20240717;

public class Ex04_Calculator {

	int first;
	int second;
	int result;

	// 생성자 // 클래스 이름과 같은 이름의 메서드
	// 생성자와 메서드의 차이점
	public Ex04_Calculator(int first, int second) {
		this.first = first;
		this.second = second;
	}

	public void add() {
		result = first + second;
	}

	public void div() {
		result = first / second;
	}

	private void sub() {
		result = first - second;
	}

	private void mul() {
		result = first * second;
	}
}
