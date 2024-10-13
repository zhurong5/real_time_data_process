package java20240719_inheritance;

public interface CalculatorImp2 extends CalculatorImp1 {
	// DEFAULT
	default void print() {
		System.out.println("디폴트 메서드");
	}

	// static
	static int total(int[] arr) {
		int total = 0;
		for (int i : arr) {
			total += i;
		}
		return total;
	}
}
