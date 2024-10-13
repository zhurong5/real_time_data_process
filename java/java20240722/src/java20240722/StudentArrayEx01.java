package java20240722;

public class StudentArrayEx01 {

	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		int i[] = new int[3]; // 배열
		Student stu1 = new Student(10001, "오주영1", 175.5, false, 3);
		Student stu2 = new Student(10002, "오주영2", 175.5, false, 3);
		Student stu3 = new Student(10003, "오주영3", 175.5, false, 3);

		Student[] stu = new Student[3]; // 객체 배열
		stu[0] = new Student(10001, "오주영1", 175.5, false, 3);
		stu[1] = new Student(10001, "오주영2", 175.5, false, 3);
		stu[2] = new Student(10002, "오주영3", 175.5, false, 3);
		System.out.println(stu[0].getStudentNum()); // 값 출력
		stu[0].setGender(true); // 값 수정
		System.out.println(stu[0].isGender()); // boolean 타입은 is이다
		
	}

}
