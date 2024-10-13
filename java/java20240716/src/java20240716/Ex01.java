package java20240716;

public class Ex01 {
	public static void main(String[] args) {
		Ex01_Calculator calculator = new Ex01_Calculator();
		calculator.add();
		calculator.print();
		Ex01_Calculator calculator2 = new Ex01_Calculator(100, 200);
		calculator2.add();
		calculator2.print();
	}
}
