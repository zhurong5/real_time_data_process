package homeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class homeWorkAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		List<Account> account = new ArrayList<Account>();

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
				account.add(new Account (accNo, owner, money));
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			case 2:
				System.out.println("------");
				System.out.println("계좌목록");
				System.out.println("------");
				for (Account obj : account) {
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
				for (Account obj : account) {
					if (obj == null)
						break;
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
				for (Account obj : account) {
					if (obj == null)
						break;
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
