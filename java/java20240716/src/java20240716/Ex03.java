package java20240716;

public class Ex03 {

	public static void main(String[] args) {
		Ex03_Calculator calculator = new Ex03_Calculator(10, 20);
		calculator.add();
		System.out.println(calculator.getFirst());
		System.out.println(calculator.getSecond());
		System.out.println(calculator.getResult());
		
		Ex03_Calculator calculator2 = new Ex03_Calculator(100, 200);
		calculator2.add();
		System.out.println(calculator2.getFirst());
		System.out.println(calculator2.getSecond());
		System.out.println(calculator2.getResult());
		
		Ex03_Calculator calculator3 = new Ex03_Calculator(1000, 2000);
		calculator3.add();
		System.out.println(calculator3.getFirst());
		System.out.println(calculator3.getSecond());
		System.out.println(calculator3.getResult());
		
		print(calculator3);
	}

	public static void print(Ex03_Calculator num) {
		System.out.println(num.getFirst());
		System.out.println(num.getSecond());
		System.out.println(num.getResult());
	}
}
