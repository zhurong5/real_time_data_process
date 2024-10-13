package java20240710;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// 2~5단까지 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작단을 입력하세요 : ");
		int startDan = scanner.nextInt();
		System.out.print("마지막 단을 입력하세요 : ");
		int endDan = scanner.nextInt();
		System.out.print("시작곱을 입력하세요 : ");
		int startGop = scanner.nextInt();
		System.out.print("마지막 곱을 입력하세요 : ");
		int endGop = scanner.nextInt();
		for (int dan = startDan; dan <= endDan; dan++) {
			for (int gop = startGop; gop <= endGop; gop++) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
			}
		}

	}

}
