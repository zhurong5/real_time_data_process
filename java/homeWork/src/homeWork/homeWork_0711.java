package homeWork;

import java.util.Iterator;

public class homeWork_0711 {

	public static void main(String[] args) {
//		1. 정수 배열을 만들었을 때 초기값은?
		// 0
//		실수 배열을 만들엇을 때 초기값은?
		// 0.0
//		부울 배열을 만들었을 때 초기값은?
		// false
//		문자열 배열을 만들었을 때 초기값은?
		// null
//		문자를 배열을 만들었을 때 초기값은?
		// "" blank

//		2. 1차원배열을 선언하는 4가지 방법에 대해서 나열하시오.

//		// 1.
//		int[] i = { 1, 2, 3 };
//		// 2.
//		int[] i1 = new int[] { 1, 2, 3, 4 };
//		// 3.
//		int[] i2 = new int[3];
//		i2[0] = 1;
//		i2[1] = 2;
//		i2[2] = 3;
//		// 4.
//		int[] i3;
//		i3 = new int[] { 1, 2, 3, 4 };

//		3. int [] dan8 = new int[9]을 이용해서 8단을 저장하고 foreach를 이용해서 출력하시오.

//		int[] dan8 = new int[9];
//		for (int idx = 0; idx < dan8.length; idx++) {
//			dan8[idx] = 8 * (idx + 1);
//		}
//		for (int val : dan8) {
//			System.out.println(val);
//		}

//		4.  위 예제에서 4번요소와 8번요소를 더한값을 출력하시오.

//		System.out.println(dan8[4] + dan8[8]);

//		5. char [] alphabets = new char[52];
//		char ch ='A';
//		을 이용해서 alphabets배열에 문자를 A~Z z~a까지 저장하시오. 

//		char[] alphabets = new char[52];
//		char ch = 'A';
//		for (int idx = 0; idx < 26; idx++, ch++) {
//			alphabets[idx] = ch;
//		}
//		ch = 'z';
//		for (int idx = 26; idx < 52; idx++, ch--) {
//			alphabets[idx] = ch;
//		}
//		for (char c : alphabets) {
//			System.out.print(c);
//		}
		

//		6. 구구단을 다음 배열에 저장하시오.
//			int [][] array = new int[8][9];// 2 부터 구구단을 저장할 2차원 배열

//		int[][] array = new int[8][9];
//		for (int dan = 0; dan < array.length; dan++) {
//			for (int gop = 0; gop < array[dan].length; gop++) {
//				array[dan][gop] = (dan + 2) * (gop + 1);
//				System.out.println((dan + 2) + " * " + (gop + 1) + " = " + array[dan][gop]);
//			}
//		}

//		7. 구구단을 다음과 같이 출력하시오
//			2단 : [2,4,6,8,10,12,14,16,18]
//			3단 : [3,6,9,12,15,18,21,24,27]
//			4단 : [4,8,12,16,20,24,28,32,36]
//			5단 : 
//			6단 : 
//			7단 :
//			8단 :
//			9단 : 

//		int[][] array = new int[8][9];
//		for (int dan = 0; dan < array.length; dan++) {
//			System.out.print((dan + 2) + "단 : [");
//			for (int gop = 0; gop < array[dan].length; gop++) {
//				array[dan][gop] = (dan + 2) * (gop + 1);
//				System.out.print(array[dan][gop]);
//				if (gop != array[dan].length - 1) {
//					System.out.print(",");
//				}
//			}
//			System.out.println("]");
//		}

//
//		8. 가변 2차원 배열을 이용해서
//			첫번째 행은 5단에서 1 ~ 3까지의 곱을 저장
//			두번재 행은 6단에서 1 ~ 6까지의 곱을 저장
//			세번째 행은 7단에서 1 ~ 9까지의 곱을 저장

//		int[][] gugudan = new int[3][];
//		int[] dan5 = new int[3];
//		int[] dan6 = new int[6];
//		int[] dan7 = new int[9];
//
//		for (int idx = 0; idx < dan5.length; idx++) {
//			dan5[idx] = 5 * (idx + 1);
//		}
//		for (int idx = 0; idx < dan6.length; idx++) {
//			dan6[idx] = 6 * (idx + 1);
//		}
//		for (int idx = 0; idx < dan7.length; idx++) {
//			dan7[idx] = 7 * (idx + 1);
//		}
//		
//		gugudan[0] = dan5;
//		gugudan[1] = dan6;
//		gugudan[2] = dan7;
//		
//		for (int[] i : gugudan) {
//			for (int j : i) {
//				System.out.println(j);
//			}
//		}

//		9. 주어진 배열에서 최대값을 구하시오.
//			int max = 0;
//			int [] array = {1,5,3,8,2};
//
//			System.out.println("max : " + max);

//		int max = 0;
//		int[] array = { 1, 5, 3, 8, 2 };
//
//		for (int i : array) {
//			if (i > max) {
//				max = i;
//			}
//		}
//
//		System.out.println("max : " + max);

//		10. 주어진 배열에 있는 요소들의 합과 평균을 구하시오.
//			int [][] array = {{95,86},{83,92,96},{78,83,93,87,88}}
//			int sum = 0;
//			double avg = 0.0;
//
//			System.out.println("sum : " + sum);
//			System.out.println("avg : " + avg);
		
//		int [][] array = {{95,86},{83,92,96},{78,83,93,87,88}};
//		int sum = 0;
//		int arrayCount = 0;
//		double avg = 0.0;
//		
//		for (int[] is : array) {
//			for (int is2 : is) {
//				sum += is2;
//				arrayCount++;
//			}
//			
//		}
//		
//		avg = (double)sum / arrayCount;
//
//		System.out.println("sum : " + sum);
//		System.out.println("avg : " + avg);

	}

}
