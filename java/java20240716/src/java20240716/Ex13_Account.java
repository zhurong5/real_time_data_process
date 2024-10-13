package java20240716;

public class Ex13_Account {
	static int idx = 0;
	int accountNo;
	String owner;
	int balance = 0;

	public Ex13_Account(int accountNo, String owner, int balance) {
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getAccountNo() {
		return accountNo;
	}

	public int getBalance() {
		return balance;
	}
	
	public void print() {
		System.out.print(accountNo + "\t");
		System.out.print(owner + "\t");
		System.out.print(balance + "\n");
	}
}
