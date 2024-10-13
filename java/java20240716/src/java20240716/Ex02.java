package java20240716;

public class Ex02 {
	static Ex02_Calculator calculator = new Ex02_Calculator(); // 기본생성자
	static Ex02_Calculator calculator2 = new Ex02_Calculator(100, 200);
	public static void main(String[] args) {
		calculator.add();
		calculator.print();
		
		calculator2.add();
		calculator2.print();
		
		print();
		
	}
	public static void print() {
		System.out.println(calculator.getFirst());
		System.out.println(calculator.getSecond());
		System.out.println(calculator.getResult());
	}

}
