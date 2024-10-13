package java20240716;

public class Ex04 {

	public static void main(String[] args) {
		Ex04_Employee employee = new Ex04_Employee("1234", "주영");
		System.out.println(employee.empNum);
		System.out.println(employee.empName);
		System.out.println(employee.empAddr);
		System.out.println(employee.empPhone);
		System.out.println(employee.empGender);
		
		Ex04_Employee employee1 = new Ex04_Employee("서울	", "010-1234-7895", 'M');
		System.out.println(employee1.empNum);
		System.out.println(employee1.empName);
		System.out.println(employee1.empAddr);
		System.out.println(employee1.empPhone);
		System.out.println(employee1.empGender);
	}

}
