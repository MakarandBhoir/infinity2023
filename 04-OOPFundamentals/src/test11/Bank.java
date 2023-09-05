package test11;

public class Bank {
	public static void main(String[] args) {
		// This is not possible because class is abstract.
		//Account acc = new Account();
		
		Account acc;
		Saving saving = new Saving(1010, "Makarand", 5000, 4.5); // concreate class
		saving.showAccount();
	}
}
