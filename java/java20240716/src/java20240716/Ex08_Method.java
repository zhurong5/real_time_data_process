package java20240716;

public class Ex08_Method {
	int first = 10;
	int second = 20;
	int result;
	public Ex08_Method() { // 생성자 오버로딩
	}
	public Ex08_Method(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	public void add() { // 메서드 오버로딩
		result = first + second; // 멤버
	}
	
	public void add(int first) {
		result = first + second; // 매개변수 first
	}
	
	public void add(int first, int second) {
		this.first = first;
		this.second = second;
		result = this.first + this.second; // 매개변수 first, second
	}
	
	// 오버로딩 : 이름은 같고 매개변수의 갯수가 다르거나 매개변수의 타입이 달라야 한다
	// - 메서드 오버로딩
	// - 생성자 오버로딩
	// this() : 생성자 내에서 다른 생성자를 사용하려 할 때
	// 메서드
	// - 값전달
	// - 객체 전달
	//
	// 리터널 : 상수
	// 변수 :
	// 함수(메서드) : x값에 따라 y값의 변화
	
}
