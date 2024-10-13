package java20240722;

public interface CalculatorImp {
	// final 변수 : 상수
	double PI = 3.141592;
	final int ERROR = 999;
	
	public abstract int add(); // 추상메서드
	public int sub();
	default void print(){
		System.out.println("디폴드 메서드");
	}
}
