package java20240718;

public class Ex05_FourCalculator extends Ex05_Calculator {

	public Ex05_FourCalculator(int first, int second) {
		super(first, second);
	}

	public void sub() {
		result = first - second;

	}

	private void mul() {
		result = first * second;

	}

	// overriding : 부모로부터 상속받은 메서드를 자식 클래스에서 다시 정의

	public void div() {
		if (second == 0) {
			result = 0;
		} else {
			result = first / second;
		}
	}
}
