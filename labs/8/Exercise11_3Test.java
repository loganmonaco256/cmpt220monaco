public class Exercise11_3Test {
	
	public static void main(String[] args) {
		// 
		Account account = new Account(10030, 1000);
		SavingsAccount savings = new SavingsAccount(8638, 1000);
		CheckingAccount checking = new CheckingAccount(1937, 1000, -20);
		// set annual interest rate 5 percent
		account.setAnnualInterestRate(5);
		savings.setAnnualInterestRate(5);
		checking.setAnnualInterestRate(5);

		// Withdraw 500
		account.withdraw(500);
		savings.withdraw(500);
		checking.withdraw(500);

		// Deposit 100
		account.deposit(100);
		savings.deposit(100);
		checking.deposit(100);

		// use toString methods for each to display info after transactions
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}
}