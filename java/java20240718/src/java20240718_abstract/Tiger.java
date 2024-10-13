package java20240718_abstract;

public class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 걸어갑니다");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}
}
