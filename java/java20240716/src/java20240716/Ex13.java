package java20240716;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("고객 수를 입력하시오 : ");
		// 고객 수
		int ownerNum = sc.nextInt();
		Ex13_Account account [] = new Ex13_Account[ownerNum];
		// 계좌 생성
		account[Ex13_Account.idx++] = new Ex13_Account(100000, "오주영", 100);
		// 입금
		System.out.println("입금 금액을 입력하세요. : ");
		int money = sc.nextInt();
		account[0].balance += money;
		// 출금
		System.out.println("출금 금액을 입력하세요 : ");
		account[0].balance -= money;

	}

}
