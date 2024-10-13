package java20240718_Array_Example;

import java.util.Iterator;

public class ArrayEx03 {

	public static void main(String[] args) {
		/*
		 * 길이가 5인 String 배열을 선언하고 사과 귤 포도 복숭아 참외로 
		 * 초기화 한 후 배열 인덱스를 활용해서 귤을 출력하세요
		 */
		String[] str = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(str[1]);
		// "포도" 가지만 출력하시오
		for (String string : str) {
			System.out.println(string);
			if(string.equals("포도")) break;
		}
	}
}
