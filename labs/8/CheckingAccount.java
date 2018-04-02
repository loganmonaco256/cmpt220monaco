public class CheckingAccount
		extends Account {
	//create the variable overdraftLimit as per checking account req
	private double overdraftLimit;
	
	//create a default checking account with an overdraft limit
	public CheckingAccount() {
		super();
		overdraftLimit = -50;
	}
    //method to create a new account with user info and an overdraft limit
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		//gets id and balance from account
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	//setter for overdraftlimit
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	//getter for overdraftlimit
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	//decreasing the account by a set amount and checking if it exceeds the overdraft
	public void withdraw(double amount) {
		if (getBalance() - amount > overdraftLimit) {
			//passes so it subtracts from balance
			setBalance(getBalance() - amount);
		}
		else
			//overdraftlimit reached 
			System.out.println("Sorry, that transaction exceeds the overdraft limit.");
	}

	//string description of the checking account class
	public String toString() {
		return super.toString() + "Overdraft limit:  $" + 
		String.format("%.5f", overdraftLimit);
	}
}