package java20240718;

public class Ex06_Calculator {
	int first;
	int second;
	int result;
	
	public Ex06_Calculator(int first, int second) {
		this.first = first;
		this.second = second;
	}
	public void add() {
		result = first + second;
	}
	
	// 메서드에 funal 키워드를 준다는 것은 자식 클래스에서 
	// 오버라이딩을 하지 못하게 할때 사용한다
	public final void div() { // final메서드
		result = first / second;
	}
}
