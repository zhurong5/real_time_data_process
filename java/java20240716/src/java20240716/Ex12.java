package java20240716;

public class Ex12 {

	public static void main(String[] args) {
		// 학생을 5명
		Ex12_Student st1 = new Ex12_Student(100001, "주영", 4, "경기");
		
		Ex12_Student []	st = new Ex12_Student[3];
		st[0] = new Ex12_Student(100002, "주영", 4, "군포");
		st[1] = new Ex12_Student(100003, "주영", 4, "군포");
		st[2] = new Ex12_Student(100004, "주영", 4, "군포");
		
		for (Ex12_Student obj : st) {
			obj.print();
		}
	}

}
