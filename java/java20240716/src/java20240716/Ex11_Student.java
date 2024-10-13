package java20240716;

public class Ex11_Student {
	static int serialNum;
	static int num1;
	int studentId;
	String studentName;
	int grade;
	String address;
	static { // static 블럭
		serialNum = 100001;
		// studentId = 1000; 멤버변수 초기화 X
		setNum1();
	}
	
	public static void setNum1() {
		num1 = 10000;
		
	}

	public Ex11_Student() {

	}

	public Ex11_Student(int studentId, String studentName, int grade, String address) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
	}

	public void print() {
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(grade);
		System.out.println(address);
	}
}
