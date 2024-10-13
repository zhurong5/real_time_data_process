package java20240722;

public class FourCalculator extends Calculator {

	public FourCalculator(int first, int second) {
		super(first, second); // 부모class에 있는 생성자 호출 : super()
	}
	public int sub() {
		return first - second;
	}
	public int mul() {
		return first * second;
	}
	// 부모클래스에서 상속 받은 메서드를 재정의 : 오버라이드
	@Override
	public int div() {
		if (second == 0) {
			return 0;
		}
		return first / second; // 10 / 0 : 불능
	}
}
