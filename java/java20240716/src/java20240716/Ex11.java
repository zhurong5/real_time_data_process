package java20240716;

public class Ex11 {

	public static void main(String[] args) {
		Ex11_Student student1 = new Ex11_Student(++Ex11_Student.serialNum, 
				"오주영", 4, "경기");
		Ex11_Student student2 = new Ex11_Student(++Ex11_Student.serialNum, 
				"오주영", 4, "군포");
		///...
		Ex11_Student studentn = new Ex11_Student(++Ex11_Student.serialNum, 
				"오주영", 4, "대야미");
		
		student1.print();
		student2.print();
		studentn.print();
		
	}

}
