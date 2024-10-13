package java20240719;

public class CalculatorEx {
	public static void main(String[]args) {
		Calculator calculator = new Calculator(10, 20);
		calculator.add(20, 30);
		System.out.println(calculator.sub());
		calculator.print();
		int sum = CalculatorImp.total(new int[] {1,2,3,4,5});
		System.out.println(sum);
	}
}
