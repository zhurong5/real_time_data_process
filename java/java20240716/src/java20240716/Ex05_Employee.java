package java20240716;

public class Ex05_Employee {
	// 직원 번호
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
		public Ex05_Employee() {

		}

		public Ex05_Employee(String empNum, String empName) {
			/*
			this.empName = empNum;
			this.empName = empName;
			*/
			this(empNum, empName, "서울", "010-1234-1234", 'M');
			// this 매서드 : 생성자 내에서 다른 생성자를 실행시킬때 사용
		}

		public Ex05_Employee(String empAddr, String empPhone, char empGender) {
			this("123456", "오주영", empAddr, empPhone, empGender);
		}

		public Ex05_Employee(String empNum, String empName, String empAddr, 
				String empPhone, char empGender) {
			this.empNum = empNum;
			this.empName = empName;
			this.empAddr = empAddr;
			this.empPhone = empPhone;
			this.empGender = empGender;
		}
		
}
