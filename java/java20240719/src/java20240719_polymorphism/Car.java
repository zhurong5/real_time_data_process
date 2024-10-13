package java20240719_polymorphism;

public class Car {
	Tire tire[] = {new HankookTire(10, "앞왼쪽"),
			new HankookTire(10, "앞오른쪽"),
			new HankookTire(10, "뒤왼쪽"),
			new HankookTire(10, "뒤오른쪽")
	};
	
	public int run() {
		System.out.println("차가 달립니다");
		if(tire[0].roll() == false) {stop(); return 1;}
		if(tire[1].roll() == false) {stop(); return 2;}
		if(tire[2].roll() == false) {stop(); return 3;}
		if(tire[3].roll() == false) {stop(); return 4;}
		return 0;
	}
	public void stop() {
		System.out.println("차를 멈춥니다.");
	}
}
