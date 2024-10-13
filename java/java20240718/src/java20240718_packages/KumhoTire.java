package java20240718_packages;

public class KumhoTire extends Tire{

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(maxRotation > accumulatedRotation) {
			System.out.println(location + "금호 수명은 " + accumulatedRotation + "회");
			return true;
		}else {
			System.out.println(location + "금호 펑크");
			return false;
		}
	}

}
