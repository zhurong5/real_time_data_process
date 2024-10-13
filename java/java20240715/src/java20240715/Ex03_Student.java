package java20240715;

public class Ex03_Student {
	// 필드
	String name;
	String addr;
	int studentNum;
	int age;
	int grade;
	double height;
	boolean gender;

	//피 호출 메서드
	public void setData(/* 매개변수 : 가인자 */
			String name, String addr, 
			int studentNum, int age, int grade, 
			double height, boolean gender) {
		this.name = name;
		this.addr = addr;
		this.studentNum = studentNum;
		this.age = age;
		this.grade = grade;
		this.height = height;
		this.gender = gender;

	}
	
	public void print() {
		System.out.println(name);
		System.out.println(addr);
		System.out.println(studentNum);
		System.out.println(age);
		System.out.println(grade);
		System.out.println(height);
		System.out.println(gender);
	}
}
