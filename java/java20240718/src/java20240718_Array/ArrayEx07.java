package java20240718_Array;

public class ArrayEx07 {

	public static void main(String[] args) {
		int i1[][] = new int[][] { { 1, 2, 3 }, { 4, 5 }, { 7, 8, 9, 10 } };
		for (int[] is : i1) {
			for (int c : is) {
				System.out.println(c);
			}
		}
	}

}
