package java20240722;

public class ArrayEx {
	public static void main(String[] args) {
		// 변수 : 하나의 값을 저장 한다.
		// 배열 : 하나 이상의 값을 저장 할 수 있다.
		// 단점 : 하나의 타입만 저장할 수 있다.
		// 		 크기가 정해져 있다.
		// class : 여러개의 타입을 지정
		//
		String str1 = "오주영";
		String str2 = "주영오";
		String str3 = "영주오";
		String[] str = new String[3]; // [][][]
		// index : 배열에 있는 요소가 가지는 고유의 번호 : 0부터
		str[0] = "오주영";
		str[1] = "주영오";
		str[2] = "영주오";
		System.out.println(str1);
		System.out.println(str[0]);
		// 배열의 크기 : 요소의 갯수
		System.out.println(str1.length());
		// 배열안에 있는 요소의 값 출력 : foreach
		for (String string : str) {
			System.out.println(string);
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}
}
