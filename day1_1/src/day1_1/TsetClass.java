package day1_1;

public class TsetClass {

	public static void main(String[] args) {
		System.out.println("Hello 오주영");
		// -128 ~ 127
		byte 오주영; // 선언
		오주영 = 10; // 초기화
		System.out.println(오주영);
		String 주영; // 문자열 변수
		주영 = "오주영"; //초기화
		System.out.println("주영");
		// byte 20; 변수명이 숫자일 수 없다.
		오주영 = 20; // 대입
		System.out.println(오주영);
		
		String firstName = "이";
		System.out.println(firstName);
		// String firstName;
		// 변수명은 한번만 선언한다.
		firstName = "오";
		System.out.println(firstName);
		// 변수명은 대소문자를 구분한다.
		String firstname = "주"; // 초기화를 안하면 오류
		System.out.println(firstName);
		System.out.println(firstname);
		
	}

}
