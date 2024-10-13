package java20240711;

public class Ex21 {

	public static void main(String[] args) {
		/*
		 *  변수 장점 : 값을 바꿀 쑤 있다
		 *  변수 단점 : 하나의 값만 저장가능하다.
		 *  배열 장점 : 하나이상의 값을 저장 할 수 있다.
		 *  배열 단점 : 한 종류의 갑만 저장 가능하다.
		 */

		Student student = new Student(); // 객체 생성
		student.name = "오주영";
		student.studentNum = "20190061";
		student.age = 25;
		student.height = 175.4;
		student.gender = true;

		System.out.println(student.name);
		System.out.println(student.studentNum);
		
		Student student1 = new Student();
		student1.name = "오주롱";
		
		System.out.println(student1.name);

	}

}
