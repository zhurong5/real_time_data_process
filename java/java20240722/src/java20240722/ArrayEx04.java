package java20240722;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 2차원 배열 선언
		// 1.
		String str1[][] = { { "오주영", "영주오" }, { "오주롱", "주롱오" } };
		// 2.
		String str2[][] = new String[][] { { "오주영", "영주오" }, { "오주롱", "주롱오" } };
		// 3.
		String str3[][] = new String[2][3];
		// 4.
		String str4[][] = new String[2][0];
		str4[0] = new String[3];
		str4[1] = new String[4];
		// 5.
		String str5[][];
		str5 = new String[][] { { "오주영", "영주오" }, { "오주롱", "주롱오" } };
		str5 = new String[2][3];
		str5 = new String[2][];
	}

}
