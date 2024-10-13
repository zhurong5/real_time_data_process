package java20240718_packages;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i <= 10; i++) {
			int num = car.run();
			switch (num) {
			case 1: // 앞 왼쪽 바퀴
				System.out.println("앞 왼쪽 금호타이어 교체");
				car.frontLefTire = new KumhoTire(10, "왼쪽앞");
				break;
			case 2: // 앞 왼쪽 바퀴
				System.out.println("앞 오른쪽 금호타이어 교체");
				car.frontRightTire = new KumhoTire(10, "오른쪽앞");
				break;
			case 3: // 앞 왼쪽 바퀴
				System.out.println("뒤 왼쪽 금호타이어 교체");
				car.backLefTire = new KumhoTire(10, "왼쪽뒤");
				break;
			case 4: // 앞 왼쪽 바퀴
				System.out.println("뒤 오른쪽 금호타이어 교체");
				car.backRightefTire = new KumhoTire(10, "오른쪾뒤");
				break;

			default:
				break;
			}
		}

	}

}
