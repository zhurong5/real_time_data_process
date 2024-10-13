package java20240710;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 단을 입력하세요 : ");
 		int dan = sc.nextInt();
 		System.out.println("시작 곱을 입력하세요 : ");
		int startGop = sc.nextInt();
		System.out.println("마지막 곱을 입력하세요. : ");
		int endGop = sc.nextInt();
		for(int gop = startGop; gop <=endGop; gop++) {
			System.out.println("5 * " + gop + " = " + dan * gop);
		}
		// 1 ~ 5까지의 합을 구하시오.
		int i = 1;
		int sum = 0;
		for (i = 1; i <= 5 ; i++) {
			sum++;
		}
		System.out.println(sum);
	}
}
