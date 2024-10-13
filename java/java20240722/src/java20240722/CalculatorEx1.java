package java20240722;

public class CalculatorEx1 {

	public static void main(String[] args) {
		/// CalculatorAbstract ex1 = new CalculatorAbstractExtends(10, 20);
		CalculatorAbstractExtends ex02 = new CalculatorAbstractExtends(10, 20);
		// 다향성
		CalculatorAbstract ex03 = new CalculatorAbstractExtends(10, 20);
	}

}
// 객체 지향의 특징
// 1. 캡슐화 : 은닉
// 2. 상속 : 오버라이딩
// 3. 다향성 : 같은 부모 클래스로 상속 받은 객체가 부모 이름으로 같이 쓸 수 있는 것
