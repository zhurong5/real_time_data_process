package java20240718_packages;

public class Car {
	// 앞 왼쪽 타이어 : 한국타이어 / 금호타이어
	Tire frontLefTire = new HankookTire(6, "앞왼쪽");
	// 앞 오른쪽 타이어
	Tire frontRightTire = new HankookTire(7, "앞오른쪽");

	Tire backLefTire = new HankookTire(8, "뒤왼쪽");

	Tire backRightefTire = new HankookTire(9, "뒤오른쪽");

	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (frontLefTire.roll() == false) {
			return 1; // 앞 왼쪽
		}
		if (frontRightTire.roll() == false) {
			return 2; // 앞 오른쪽
		}
		if (backLefTire.roll() == false) {
			return 3; // 뒤 왼쪽
		}
		if (backRightefTire.roll() == false) {
			return 4; // 뒤 오른쪽
		}
		return 0;
	}

	void stop() {
		System.out.println("[차가 멈췄습니다]");
	}
}
