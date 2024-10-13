package java20240712;

import java.util.Arrays;
import java.util.Iterator;

public class Ex01 {

	public static void main(String[] args) {

		// 숙제 리뷰

		// 5. 반복문 한번쓰는 방법
		char[] alphabets = new char[52];
		char ch = 'A';
		for (int idx = 0; idx < alphabets.length; idx++) {
			if (idx < 26)
				alphabets[idx] = ch++;
			if (idx == 26)
				ch = 'z';
			if (idx >= 26)
				alphabets[idx] = ch--;
		}
		for (char c : alphabets) {
			System.out.print(c);
		}

		int[][] array = new int[8][9];
		for (int dan = 0; dan < array.length; dan++) {
			for (int gop = 0; gop < array[dan].length; gop++) {
				array[dan][gop] = (dan + 2) * (gop + 1);
				System.out.println((dan + 2) + " * " + (gop + 1) + " = " + array[dan][gop]);
			}
		}

		// 7.
		int d = 2;
		for (int[] row : array) {
			System.out.print(d++ + "단 : ");
			System.out.println(Arrays.toString(row));
		}

		// 8.
		int[][] gugudan = new int[3][];
		gugudan[0] = new int[3];
		gugudan[1] = new int[6];
		gugudan[2] = new int[9];

		for (int idx = 0; idx < gugudan.length; idx++) {
			for (int colIdx = 0; colIdx < gugudan[idx].length; colIdx++) {
				gugudan[idx][colIdx] = (idx + 5) * (colIdx + 1);
			}
		}
		for (int[] is : gugudan) {
			System.out.println(Arrays.toString(is));
		}

	}
}
