package java20240711;

public class Ex08 {

	public static void main(String[] args) {
		double dd[] = new double[3];
		// 10.5, 20.5, 30.5를 넣고 저장된 값을 출력하고 싶다.
		// 단 숫자와 length 사용하지 않고 반복문을 사용해서 출력하시오.

		int size = 0;
		double d = 10.5;
		for (double i : dd) {
			size++;
		}
		for (int idx = 0; idx < size; idx++, d += 10) {
			dd[idx] = d;
			System.out.println(dd[idx]);
		}

	}

}
