package test11;

public final class Saving extends Account {
	private double roi;
	
	Saving(int accountNumber, String name, double balance, double roi){
		super(accountNumber, name, balance);
		this.roi = roi;
	}
	
	public void showAccount() {
		System.out.println("Account Number = " + super.accountNumber);
		System.out.println("Account Holder = " + super.accountHolder);
		System.out.println("Account Balance = " + super.accountBalance);
		System.out.println("Rate of Interest = " + this.roi);
	}
	//can't override final method
//	public void xyz() {
//		
//	}
}

//class AnotherSaving extends Saving{
//	
//}