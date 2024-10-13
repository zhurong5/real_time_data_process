package java20240722;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor // 생성자
@NoArgsConstructor // 기본 생성자
@Setter // setter
@Getter // getter

public class Student { // 캡슐화
	// 변수 : 하나의 값만 저장
	// 배열 : 하나 이상의 값을 저장
	// 		 크기가 고정이다  : 단점을 보완 Collection(list, set)
	// 		 하나의 타입만 저장 가능 : 단점을 보완 class
	int studentNum;
	String studentName;
	double height;
	boolean gender;
	int grade;
	// 멤버를 초기화 하기 위해서 생성자
	
}
