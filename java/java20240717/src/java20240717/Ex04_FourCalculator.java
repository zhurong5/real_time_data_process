package java20240717;

public class Ex04_FourCalculator extends Ex04_Calculator{
	
	// 부모클래스에 생성자가 있다면 자식클래스에서 부모 생성자를 실행하도록
	// 자식클래스에도 생성자가 존재해야 한다
	public Ex04_FourCalculator(int first, int second) {
		// 부모클래스의 생성자를 실행시킬때는 super 메서드를 사용한다.
		super(first, second);
		System.out.println("자식 객체");
	}

	private void sub() {
		result = first - second;
	}
	
	private void mul() {
		result = first / second;
	}
}
