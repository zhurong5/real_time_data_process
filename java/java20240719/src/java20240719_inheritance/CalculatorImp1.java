package java20240719_inheritance;

public interface CalculatorImp1 {
	// 상수일 땐 모두 대문자
	final double PI = 3.141592;
	int ERROR = 99999;
	// 추상메서드
	void add(int num1, int num2);
	int sub();
	
}
