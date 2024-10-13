package java20240718_Array_Example;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class ArrayEx06 {

	public static void main(String[] args) {
		/*
		 * 사용자가 배열의 길이를 직접 입력하여 그 길이만큼 정수형 배열을 선언 및
		 * 할당하고 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요
		 * 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요
		 * 
		 * 정수 : 5
		 * 배열 0번째 인덱스에 넣을 값 : 4
		 * 배열 1번쨰 인덱스에 넣을 값 : -4
		 * ....
		 * 4 -4 3 -3 2
		 * 합 : 2
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = scanner.nextInt();
		int i [] = new int [num];
		int sum = 0;
		for (int j = 0; j < i.length; j++) {
			System.out.print("배열 " + j + "번째 인덱스에 넣을 값 : ");
			i[j] = scanner.nextInt();	
		}
		for (int j : i) {
			System.out.print( j + " ");
			sum += j;
		}
		System.out.println();
		System.out.println("합 : " + sum);
	}

}
