package java20240718_Array_Example;

public class ArrayEx01 {

	public static void main(String[] args) {
		/*
		 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		 * 순서대로 배열 인덱스에 넣은 후 그 값을출력하세요
		 */
		
		int i [] = new int [10];
		for(int idx = 0; idx < i.length; idx++) i[idx] = idx+1;
		for (int j : i) {
			System.out.println(j);
		}
		

	}

}
