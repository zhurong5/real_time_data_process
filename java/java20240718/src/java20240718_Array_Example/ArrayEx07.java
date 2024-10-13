package java20240718_Array_Example;

import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {
		/*
		 * 양념 , 후하이드 , 순살 인 문자열 배열에 사용자가 입력한 값이 배열에 있는지 검색하여 있으면 "OOO 치킨 배달 가능" 없으면
		 * "OOO치킨은 없는 메뉴입니다"를 출력하세요
		 */
		String i[] = { "양념", "후라이드", "순살" };
		Scanner scanner = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String ch = scanner.nextLine();

		int num = -1;
		for (String string : i) {
			if (string.equals(ch)) {
				num = 0;
				break;
			}

		}
		if (num == 0) {
			System.out.println(ch + "치킨 배달 가능");
		} else {
			System.out.println(ch + "치킨은 없는 메뉴입니다");
		}

	}

}
