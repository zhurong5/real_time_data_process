package java20240722_wrapper;

public class StringEx {

	public static void main(String[] args) {
		// 리터널 : 정수, 실수, 문자, 부울, 문자열
		// 비지니스 타입 : int, double, char, boolean
		String str1 = "오주영";
		String str2 = "오주영";
		if (str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		String str = new String("오주영");
		if (str == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if (str.equals(str1)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
	}

}
