package java20240719;

public interface CalculatorImp {
	final double PI = 3.141592; // 상수
	int ERROR = 99999; // 상수
	
	// 추상 메서드
	void add(int num1, int num2);
	int sub();
	
	// default 메서드
	default void print() {
		System.out.println("디폴트 메서드");
	}
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		return total;
	}
}
