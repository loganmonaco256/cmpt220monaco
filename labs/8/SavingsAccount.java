public class SavingsAccount
		extends Account {
	
	//create default savings account
	public SavingsAccount() {
		super();
	}

	// creates default savings account with set Id and balance
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	// decrease by an amount
	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println(
				"Sorry, that transaction can't be completed, insufficient funds.");
	}
}