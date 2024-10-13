package java20240722;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 2차원 : 1차원의 집합체
		String[][] str = new String[2][3];

		str[0][0] = "오주영";
		str[0][1] = "영주오";
		str[0][2] = "주영오";
		str[1][0] = "영오주";
		str[1][1] = "주오영";
		str[1][2] = "오영주";
		// 요소 출력
		System.out.println(str[0][0]);
		// 배열의 크기
		System.out.println(str.length); // 2 : 행의크기
		// 각 행의 크기 : 각행에 있는 1차원의 크기
		System.out.println(str[0].length); // 첫번째 행의 크기
		System.out.println(str[1].length); // 두번째 행의 크기
		// 출력 : foreach
		for (String[] s : str) {
			for (String v : s) {
				System.out.println(v);
			}
		}
		// index를 이용해서 출력
		for (int row = 0; row < str.length; row++) {
			for (int col = 0; col < str[row].length; col++) {
				System.out.println(str[row][col]);
			}
		}
	}

}
