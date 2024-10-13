package java20240716;

public class Ex12_Student {
	static int serialNum;
	static int num1;
	int studentId;
	String studentName;
	int grade;
	String address;

	public Ex12_Student(int studentId, String studentName, int grade, String address) {
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
