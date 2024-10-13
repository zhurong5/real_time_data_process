package java20240717;

public class Ex01 {

	public static void main(String[] args) {
		int  i [] = new int [3];
		i[0] = 10;
		i[1] = 20;
		
		Account [] acc = new Account[3];
		
		// 배열의 초기값 : 정수배열 0, 실수배열 0.0, 부울배열 false, 문자 blank
		// 문자열을 포함한 나머지 배열 초기값 null
		
		Account acc1 = new Account(100001, "오주영", 1000);
		Account acc2 = new Account(100001, "오주영", 1000);
		Account acc3 = new Account(100001, "오주영", 1000);
		
		acc[0] = new Account(100001, "주영", 1000);
		acc[1] = new Account(100001, "주영", 1000);
		for (int val : i) {
			System.out.println(val);
		}
		
		for (Account obj : acc) {
			if (obj == null) break;
			System.out.println(obj.accountNo);
		}
		

	}

}
