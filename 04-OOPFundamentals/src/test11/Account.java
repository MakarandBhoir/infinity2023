package test11;

public abstract class Account {
	protected int accountNumber;
	protected String accountHolder;
	protected double accountBalance;
	
	public Account() {
	}
	
	Account(int accountNumber, String name, double balance){
		this.accountNumber = accountNumber;
		accountHolder = name;
		accountBalance = balance;
	}
	
	public abstract void showAccount();
	
	public final void xyz() {
		System.out.println("xyz");
	}
}
