package java20240718_Array_Example;

import lombok.val;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.

		int i[] = new int[10];
		for (int j = 0, val = 10; j < i.length; j++, val--) {
			i[j] = val;
		}
		for (int j : i) {
			System.out.println(j);
		}
	}

}
