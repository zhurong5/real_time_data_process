package java20240719_wrapper;

import java.util.Iterator;

public class LottoEx2 {
	public static void main(String[] args) {
		int lottoNum [] = new int[6];
		for(int i = 0; i <=5; i++) {
			boolean b = true;
			int num = (int)(Math.random() * 46);
			for (int j : lottoNum) {
				if (num == j) {
					i--; b = false; break;
				}
			}
			
			if(b== true) lottoNum[i] = num;
		}
		for (int i : lottoNum) {
			System.out.print(i + " ");
		}
	}
}
