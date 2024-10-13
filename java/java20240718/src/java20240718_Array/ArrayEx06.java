package java20240718_Array;

public class ArrayEx06 {

	public static void main(String[] args) {
		int i1[][] = new int[][] { { 1, 2, 3 }, { 4, 5 }, { 7, 8, 9, 10 } };
		// 1차원의 개수는 2차원의 크기
		System.out.println(i1.length);
		System.out.println(i1[0].length);
		System.out.println(i1[1].length);
		System.out.println(i1[2].length);
	}

}
