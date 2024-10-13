package java20240709;

public class Ex13 {
	public static void main(String[] args) {
		/*
		 * 제어문 : 조건문 : if, switch 반복문 : for, while, do~while 조건문 : if(조건식){ 명령어 } 조건식에는
		 * 부울타입인 결과가 오는 식이나 값이여야 한다. if(true){} if(i > y){} 명령어는 조건식의 결과값이 true일 때 실행할
		 * 코드작성
		 */
		int money = 1000;
		// 버스를 타려면 1450원이 있어야 한다.
		if (money >= 1450) {
			System.out.println("버스를 타고가세요");
		} else {
			System.out.println("버스비가 모자라요");
		}
		int age = 8;
		if (age >= 7) { // 단일 if문
			System.out.println("학교를 갑니다");
		}

		int eng = 60;
		int kor = 70;
		int mat = 50;

		if (eng >= 60) {
			System.out.println("pass");
		}
		if (kor >= 60) {
			System.out.println("pass");
		}
		if (mat >= 60) {
			System.out.println("pass");
		}
	}
}
