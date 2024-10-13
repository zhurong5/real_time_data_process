package java20240716;

public class Ex02_1 {

	public static void main(String[] args) {
		Ex02_Calculator calculator = new Ex02_Calculator();
		calculator.add();
		calculator.print();
		Ex02_Calculator calculator2 = new Ex02_Calculator(100, 200);
		calculator2.add();
		calculator2.print();
		test(10, 20);
		test(100, 200);
		test(calculator.getFirst(), calculator.getSecond());
		
		print(calculator);

	}
	public static void test(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public static void print(Ex02_Calculator c) {
		System.out.println(c.getFirst());
		System.out.println(c.getSecond());
		System.out.println(c.getResult());
	}

}
