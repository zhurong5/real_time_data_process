package java20240710;

public class Ex21 {

	public static void main(String[] args) {
		// 1~100까지의 합을 구할 때 홀수의 합만 구하여라
		// 조건문, continue
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			if (i % 2 == 1) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);

		sum = 0;
		i = 0;
		while (i < 100) {
			i++;
			if (i % 2 == 0)
				continue;
			sum += i;
		}
		System.out.println(sum);

		sum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 != 0)
				sum += i;

		}
		System.out.println(sum);
	}

}
