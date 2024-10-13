package java20240709;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] asgs) {
		// Scanner를 이용해서 변서 kor, eng, mat에 값을 입력받자
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하시요 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력하시요 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력하시요 : ");
		int mat = sc.nextInt();
		System.out.println("국어 : " + kor + "점 영어 : " + eng + "점 수학 : " + mat + "점");
		// 각 과목이 40점 이상이어야 하고
		// 평균이 60점 이상이어야 합격이다.
		if (mat >= 40 && kor >= 40 && eng >= 40 && (mat + kor + eng) / 3 >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
}
