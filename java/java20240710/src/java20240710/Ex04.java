package java20240710;

public class Ex04 {

	public static void main(String[] args) {
		// switch
		char gender = 'M';
		if (gender == 'M') {
			System.out.println("남자입니다");
		} else {
			System.out.println("여자입니다");
		}
		switch (gender) {
		case 'M':
			System.out.println("남자입니다");
			break;
		case 'F':
			System.out.println("여자입니다");
		}
		switch (gender) {
		case 'M':
			System.out.println("남자입니다");
			break;
		default:
			System.out.println("여자입니다");
		}
		switch (gender) {
		default:
			System.out.println("여자입니다");
			break;
		case 'M':
			System.out.println("남자입니다");
		}
	}

}
