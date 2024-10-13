package java20240710;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// 구구단 5단
		for (int i = 1; i <= 9; i++) {
			System.out.println("5 * " + i + " = " + 5 * i);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해 주세요 : ");

		int dan = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}

}
