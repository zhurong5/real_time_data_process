package java20240716;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		boolean run = true;
		Scanner scanner = new Scanner(System.in);

		System.out.print("고객 수를 입력하시오 : ");
		int ownerNum = scanner.nextInt();
		Ex13_Account account[] = new Ex13_Account[ownerNum];

		while (run) { // run이 false일 때가지 무한루프
			System.out.println("----------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택> ");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				System.out.println("------");
				System.out.println("계좌생성");
				System.out.println("------");
				System.out.print("계좌번호 : ");
				int accNo = scanner.nextInt();
				System.out.print("계좌주 : ");
				scanner.nextLine();
				String owner = scanner.nextLine();
				System.out.print("초기입금액 : ");
				int money = scanner.nextInt();
				account[Ex13_Account.idx++] = new Ex13_Account(accNo, owner, money);
				System.out.println("결과 : 계좌가 생성되었 습니다.");
				break;
			case 2:
				System.out.println("------");
				System.out.println("계좌목록");
				System.out.println("------");
				for (Ex13_Account obj : account) {
					if (obj == null)
						break;
					obj.print();
				}
				break;
			case 3:
				System.out.println("------");
				System.out.println("예금");
				System.out.println("------");
				System.out.println("계좌번호: ");
				accNo = scanner.nextInt();
				System.out.println("예금액: ");
				money = scanner.nextInt();
				for (Ex13_Account obj : account) {
					if(obj == null) break;
					if (obj.getAccountNo() == accNo) {
						obj.setBalance(obj.getBalance() + money);
					}
				}
				break;
			case 4:
				System.out.println("------");
				System.out.println("출금");
				System.out.println("------");
				System.out.println("계좌번호: ");
				accNo = scanner.nextInt();
				System.out.println("출금액: ");
				money = scanner.nextInt();
				for (Ex13_Account obj : account) {
					if(obj == null) break;
					if (obj.getAccountNo() == accNo) {
						obj.setBalance(obj.getBalance() - money);
					}
				}
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
