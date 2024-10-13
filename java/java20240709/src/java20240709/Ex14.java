package java20240709;

public class Ex14 {
	public static void main(String[] args) {
		char gender = 'M';
		if (gender == 'M') { // 조건문의 결과가 true일 때 실행
			System.out.println("남자");
		} else { // 조건문의 결과가 false가 올 때 실행
			System.out.println("여자");
		}
		int money = 1000;
		if (money >= 1450) {
			System.out.println("버스를 타고 가시오.");
		} else {
			System.out.println("버스비가 없습니다");
		}
		// 각 과목이 40점 이상이어야 합격이어야 하고
		// 평균이 60점 이상이어야 합격이다.
		int eng = 40;
		int kor = 70;
		int mat = 80;
		boolean result;
		result = eng >= 40 && kor >= 40 && mat >= 40 && (kor + eng + mat) / 3 >= 60;
		if (result) { // true
			System.out.println("합격");
		} else { // false
			System.out.println("불합격");
		}
		if (eng >= 40 && kor >= 40 && mat >= 40 && (kor + eng + mat) / 3 >= 60) { // true
			System.out.println("합격");
		} else { // false
			System.out.println("불합격");
		}
	}
}
