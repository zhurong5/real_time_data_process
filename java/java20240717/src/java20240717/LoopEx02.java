package java20240717;

import java.util.Scanner;

public class LoopEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.print("1이상의 숫자를 입력하세요 : "); int num = sc.nextInt(); if(num < 1) {
		 * System.out.println("1 이상의 숫자를 입력해주세요"); } else { for (int i = 1; i <= num;
		 * i++) { System.out.print(i + "\t"); } }
		 */

		/*
		 * 2. 위 예제에서 1미만의 숫자가 입력됐다면 "1이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 */

		/*
		 * while (true) { System.out.print("1이상의 숫자를 입력하세요 : "); int num = sc.nextInt();
		 * if (num < 1) System.out.println("1 이상의 숫자를 입력해주세요"); else { for (int i = 1; i
		 * <= num; i++) { System.out.print(i + "\t"); } break; }
		 * 
		 * }
		 */

		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요. 단. 입력한 수는 1보다 크거나 같아야 합니다
		 */
		/*
		 * System.out.print("1이상의 숫자를 입력하세요 : "); int num = sc.nextInt(); if(num < 1) {
		 * System.out.println("1이상의 값을 입력하세요."); }else { for (int i = num; i >= 1; i--)
		 * { System.out.print(i + "\t"); } }
		 */
		// 위 예제에서 1보다 작은 값을 입력하면 1이상의 값을 입력할 때까지 반복하고 싶다
		/*
		 * while (true) { System.out.print("1이상의 숫자를 입력하세요 : "); int num = sc.nextInt();
		 * if(num < 1) { System.out.println("1이상의 값을 입력하세요."); }else { for (int i = num;
		 * i >= 1; i--) { System.out.print(i + "\t"); break; } } }
		 */
		// 1부터 사용자에게 입력받은 수까지의 정수들의 합을 출력하세요
		/*
		 * System.out.print("1이상의 숫자를 입력하세요 : "); int num = sc.nextInt(); int sum = 0;
		 * for (int i = 1; i <= num; i++) { sum += i; } System.out.println(sum);
		 */

		// 위 예제를 1+2+3+4+5....+10=55 출력되게 하시오
		/*
		 * System.out.print("1이상의 숫자를 입력하세요 : "); int num = sc.nextInt(); int sum = 0;
		 * for (int i = 1; i <= num; i++) { System.out.print(i); if (i != num) {
		 * System.out.print("+"); }else { System.out.print("="); } sum += i;
		 * 
		 * } System.out.println(sum);
		 */

		/*
		 * 두개의 값을 입력받았을 때 첫번째 갓이 크거나 두번째 값이 커도 무조건 작은 값부터 출력하세요 첫번째 값 : 1 , 두번쨰 값 : 5 =>
		 * 1,2,3,4,5 첫번째 값 : 5 , 두번째 값 : 1 => 1,2,3,4,5 두 개의 값중 적어도 하나의 값이 1보다 작으면
		 * "1이상의 값을 입력하세요"
		 */
		/*
		 * System.out.print("첫 번째 숫자 : "); int num1 = sc.nextInt();
		 * System.out.print("두 번째 숫자 : "); int num2 = sc.nextInt(); if (num1 < 1 || num2
		 * < 1) { System.out.println("1이상의 값을 입력하세요"); } else {
		 * 
		 * if (num1 < num2) { for (int i = num1; i <= num2; i++) { System.out.print(i +
		 * "\t"); } } else { for (int i = num2; i <= num1; i++) { System.out.print(i +
		 * "\t"); } } }
		 */
		/*
		 * 사용자로부터 입력 받은 값부터 구구단을 출력하시오 단 1미만 또는 10이상의 값을 입력하면 1부터 9까지의 수만 입력하세요
		 */
		/*
		 * while (true) { int gugu = sc.nextInt(); if (gugu < 1 || gugu >= 10) {
		 * System.out.println("1부터 9까지의 수만 입력하세요"); } else { for (int dan = gugu; dan <=
		 * 9; dan++) { System.out.println("==== " + dan + "단 ===="); for (int gop = 1;
		 * gop <= 9; gop++) { System.out.println(dan + " * " + gop + " = " + dan * gop);
		 * } } break; } }
		 */
		/*
		 * 두개의 숫자를 입력받고 하나의 사칙 연산자 중 하나를 입력받아 사칙연산을 할 수 있게 코드를 작성하시오. + , - , * , / 아니면
		 * 해당 연산자가 없습니다. 라 출력후 다시 입력받기
		 * 
		 */
		/*
		while (true) {
			System.out.println("첫번쨰 수 : ");
			int num1 = sc.nextInt();
			System.out.println("두번째 수 : ");
			int num2 = sc.nextInt();
			System.out.println("연산자(+, -, *, /, %)");
			sc.nextLine();
			String op = sc.nextLine();
			switch (op) {
			case "+":
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case "-":
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case "*":
				System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
				break;
			case "/":
				if (num2 == 0) {
					System.out.println("0으로 나눌 수가 없습니다");
					continue;
				} else {
					System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
				}
				break;
			case "%":
				if (num2 == 0) {
					System.out.println("0이 아닌 값을 입력하세요");
					continue;
				} else {
					System.out.println(num1 + " % " + num2 + " = " + num1 % num2);
				}
				break;

			default:
				System.out.println("해당 연산자가 없습니다");
				continue;
			}
			break;
		}
		*/
		/*
		 * 정수 입력 : 5
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();
		for (int i = star; i >=1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
