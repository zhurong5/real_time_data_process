package java20240722_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java20240722.Account;

public class BankAccountMap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Account> account = new HashMap<Integer, Account>();
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------");
			String num = scanner.nextLine();
			switch (num) {
			case "1":
				System.out.println("--------");
				System.out.println("계좌 생성");
				System.out.println("--------");
				System.out.print("계좌 번호 : ");
				int accNo = Integer.parseInt(scanner.nextLine());
				System.out.print("계좌주 : ");
				String owner = scanner.nextLine();
				System.out.print("초기 입금액 : ");
				int money = Integer.parseInt(scanner.nextLine());
				account.put(accNo, new Account(accNo, owner, money));
				System.out.println("계좌가 생성되었습니다.");
				break;
			case "2":
				System.out.println("--------");
				System.out.println("계좌 목록");
				System.out.println("--------");
				// 모든 키 받아오기 account.keySet()
				for (Integer key : account.keySet()) {
					Account acc = account.get(key);
					System.out.print(acc.getAccountNo() + "\t");
					System.out.print(acc.getOwner() + "\t");
					System.out.print(acc.getBalance() + "\n");
				}
				break;

			case "3":
				System.out.println("--------");
				System.out.println("입금");
				System.out.println("--------");
				System.out.print("계좌 번호 : ");
				accNo = Integer.parseInt(scanner.nextLine());
				if (account.get(accNo) != null) {
					Account acc = account.get(accNo);
					System.out.print("입금액 : ");
					money = Integer.parseInt(scanner.nextLine());
					acc.deposit(money);
				} else {
					System.out.println("해당계좌가 존재하지 않습니다.");
				}
				break;

			case "4":
				System.out.println("--------");
				System.out.println("출금");
				System.out.println("--------");
				System.out.print("계좌 번호 : ");
				accNo = Integer.parseInt(scanner.nextLine());
				if (account.get(accNo) != null) {
					Account acc = account.get(accNo);
					System.out.print("입금액 : ");
					money = Integer.parseInt(scanner.nextLine());
					acc.withdraw(money);
				} else {
					System.out.println("해당계좌가 존재하지 않습니다.");
				}
				break;

			case "5":
				run = false;
				System.out.println("프로그램 종료");
				break;

			default:
				System.out.println("입력 번호가 틀렸습니다.");
				break;
			}
		}
	}

}
