package java20240711;

import java.util.Iterator;

public class Ex07 {

	public static void main(String[] args) {
		char ch[] = { 'A', 'B', 'C' };
		char ch1[] = new char[] { 'A', 'B', 'C' };
		char ch2[] = new char[3]; // "": blank
		for (int idx = 0; idx < ch1.length; idx++) {
			ch2[idx] = (char) (idx + 65);
		}
		char charecter = 'A';
		for (int idx = 0; idx < ch2.length; idx++, charecter++) {
			ch2[idx] = charecter;
		}
		// 소문자
		for (int idx = 0; idx < ch1.length; idx++) {
			ch2[idx] = (char) (idx + 65 + 32);
		}
	}
}