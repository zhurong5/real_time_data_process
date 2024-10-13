package java20240715;

public class Ex02 {

	public static void main(String[] args) {
		int i = 10; // 정수 리터럴 변수 : 정수변수
		
		Ex02_Student st = new Ex02_Student(); // st : class 변수, 객체변수
		// new Student(); 객체 생성
		st.name = "오주영";
		st.addr = "서울";
		st.studentNum = 20190061;
		
		System.out.println(st.name + st.addr + st.age);

		int i1 = 20;
		
		Ex02_Student st1 = new Ex02_Student();
		st1.name = "주영";
		st1.age = 25;
	}

}
