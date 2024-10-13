package java20240718;

public class Ex04_FourCalculator extends Ex04_Calculator{

	public Ex04_FourCalculator() {
		super();
	}
	public Ex04_FourCalculator(int first, int second) {
		super(10, 20);
	}
	public void sub() {
		result = first - second;
	}
	private void mul() {
		result = first * second;
	}
}
