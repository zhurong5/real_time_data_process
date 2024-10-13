package java20240719_wrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> lottoNum = new ArrayList<Integer>();
		System.out.print("원하는 수량을 입력하시요 : ");
		int cnt = sc.nextInt();
		for (int k = 0; k < cnt; k++) {
			for (int i = 1; i <= 45; i++) {
				lottoNum.add(i);
			}

			for (int j = 1; j <= 6; j++) {
				int size = lottoNum.size();// 45
				int idx = (int) (Math.random() * size); // 0~44
				int num = lottoNum.remove(idx);// 0~44
				System.out.print(num + " ");

			}
			System.out.println();
			lottoNum.clear();
		}

	}

}
