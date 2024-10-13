package java20240711;

public class Ex13 {

	public static void main(String[] args) {
		int[] i = { 1, 2, 3, 4 };
		System.out.println(i.length); // 크기 : 4
		for (int idx = 0; idx < i.length; idx++) {
			System.out.println(i[idx]);
		}

		// foreach
		for (int val : i) {
			System.out.println(val);
		}

	}

}
