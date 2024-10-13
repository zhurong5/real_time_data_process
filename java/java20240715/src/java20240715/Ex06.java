package java20240715;

public class Ex06 {

	public static void main(String[] args) {
		Ex06_Person person = new Ex06_Person();
		person.setData("오주영", "01048044599", "대야미", 25, 175, true);
		//person.gender = false; // 직접 접근
		person.setGender(false);
		
	}

}
