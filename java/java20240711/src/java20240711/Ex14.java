package java20240711;

public class Ex14 {

	public static void main(String[] args) {
		// 2차원 배열
		// 1.
		int i1[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 6, 7, 8 } };
		// 가변형 2차원 배열
		int i2[][] = new int[][] { { 1, 2, 3, 4 }, { 5, 6 }, { 7, 8, 9 } };
		for (int[] i : i2) {
			for (int val : i) {
				System.out.println(val);
			}
		}
		System.out.println(i2.length); // 2차원의 크기
		System.out.println(i2[0].length);
		System.out.println(i2[1].length);
		System.out.println(i2[2].length);
		for (int idx = 0; idx < i2.length; idx++) {
			for (int colIdx = 0; colIdx < i2[idx].length; colIdx++) {
				System.out.println("i2[" + idx + "]" + "[" + colIdx + "] : "  + i2[idx][colIdx]);
			}
		}
	}

}
