package java20240722;

import java.util.ArrayList;
import java.util.List;

public class StudentArrayListEx01 {

	public static void main(String[] args) {
		// 배열의 단점 : 크기가 고정
		Student[] stu = new Student[3]; // 객체 배열
		stu[0] = new Student(10001, "오주영1", 175.5, false, 3);
		stu[1] = new Student(10002, "오주영2", 175.5, false, 3);
		stu[2] = new Student(10003, "오주영3", 175.5, false, 3);
		// ArrayIndexOutOfBoundsException
		// stu[3] = new Student(10004, "오주영4", 175.5, false, 3);
		List<String> list = new ArrayList<String>();
		list.add("오주영");
		// 1. 객체리스트 선언
		List<Student> stuList = new ArrayList<Student>();
		// 2. 객체 저장
		stuList.add(new Student(10001, "오주영1", 175.5, false, 3));
		stuList.add(new Student(10002, "오주영2", 175.5, false, 3));
		stuList.add(new Student(10003, "오주영3", 175.5, false, 3));
		// 3. 수정
		stuList.set(1, new Student(10002, "오주영2", 175.5, true, 3));
		// 4. 크기
		System.out.println(stuList.size());
		// 5. 삭제
		Student stu1 = stuList.remove(2);
		System.out.println(stu1.getStudentName());
		// 6. 출력
		System.out.println(stuList);
		for (Student student : stuList) {
			System.out.println(student.getStudentName());
		}
	}

}
