package lab6;

public class testcaseproblem9_5 {
	public static void main(String[] args) {
		
		// ID of 1122, and a balance of $20,000
		Account account = new Account(1122, 20000);

		// Set annual interest rate of 4.5%
		account.setAnnualInterestRate(4.5);

		// Withdraw $2,500
		account.withdraw(2500);

		// Deposit $3,000
		account.deposit(3000);
		
		System.out.println("Account Statement: ");
		System.out.println("The account ID is: " + account.getId());
		System.out.println("The date created is: " + account.getDateCreated());
		System.out.printf("The balance is: $%.2f\n", account.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", account.getMonthlyInterest());
	}
}

