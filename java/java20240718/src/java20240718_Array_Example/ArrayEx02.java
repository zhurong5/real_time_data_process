package java20240718_Array_Example;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		/*
		 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		 * 1부터 입력받은 값까지 배열에 초기화한 후 출력하세요
		 */
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int i [] = new int[num];
		for(int idx = 0; idx < i.length; idx++) {
			i[idx] = idx + 1;
		}
		for (int j : i) {
			System.out.println(j);
		}
	}	

}
