package java20240710;

import java.lang.classfile.constantpool.Utf8Entry;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// 1 ~ 100까지의 합을 구하는 while문을 만드시오
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		System.out.print("시작 숫자를 입력하세요 : ");
		int i = scanner.nextInt();
		System.out.print("마지막 숫자를 입력하세요 : ");
		int end = scanner.nextInt();
		while (i <= end) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
