package java20240718_abstract;

public class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다");
	}
	public void flying() {
		System.out.println("독수리가 하늘을 날아갑니다");
	}
}