package java20240710;

public class Ex20 {

	public static void main(String[] args) {
		int gop = 1;
		while (true) {
			System.out.println("5 * " + gop + " = " + 5 * gop);
			gop++;
			if (gop == 10)
				break;
		}
		// 홀수 곱만 출력
		gop = 1;
		while (gop <= 9) {
			if (gop % 2 == 1) {
				System.out.println("5 * " + gop + " = " + 5 * gop);
			}
			gop++;
		}
		// 짝수 곱만 출력
		gop = 0;
		while (gop <= 8) {
			gop++;
			if (gop % 2 == 0) continue;
			System.out.println("5 * " + gop + " = " + 5 * gop);
		}
	}
}
