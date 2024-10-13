package java20240715;

public class Ex03 {

	public static void main(String[] args) {
		Ex03_Student student = new Ex03_Student();
		student.name = "오주영";

		Ex03_Student student2 = new Ex03_Student();
		// 호출 매서드 : 인자 : 실인자
		student2.setData("오주영", "경기", 20190061, 25, 4, 175, true);
		
		student2.print();
	}

}
