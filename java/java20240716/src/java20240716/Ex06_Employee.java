package java20240716;

public class Ex06_Employee {
	String empNum;
	// 직원 이름
	String empName;
	// 직원 주소
	String empAddr;
	// 직원 연락처
	String empPhone;
	// 성별
	char empGender;

	// 아이디
	public Ex06_Employee() {

	}

	public Ex06_Employee(String empAddr, String empPhone, char empGender) {
		this.empAddr = empAddr;
		this.empPhone = empPhone;
		this.empGender = empGender;
	}
	
	public Ex06_Employee(String empNum, String empName) {
		this("서울", "010-1234-4321", 'M');
		this.empNum = empNum;
		this.empName = empName;
		// this 매서드 : 생성자 내에서 다른 생성자를 실핼시킬때 사용
	}
}
