package java20240710;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작 수를 입력하세요. : ");
		int start = scanner.nextInt();
		System.out.print("마지막 수를 입력하세요. : ");
		int end = scanner.nextInt();
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
