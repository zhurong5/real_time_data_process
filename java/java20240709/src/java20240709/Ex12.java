package java20240709;

public class Ex12 {

	public static void main(String[] args) {
		// 4년마다 윤년이지만 100년마다는 윤년이 아니다.
		// 400마다는 다시 윤년이 된다.
		int year = 2400; // true : 윤년 / false : 평년
		boolean result;
		result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		System.out.println(result);
		if (result) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		String str;
		str = result ? "윤년" : "평년"; // 삼항연산자, 조건연산자
		System.out.println(str);
		str = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "윤년" : "평년";
		System.out.println(str);
		int num = 10;
		result = num % 2 == 0;

		num = result ? 10 + 5 : 10 - 5;
		System.out.println(num);
	}
}