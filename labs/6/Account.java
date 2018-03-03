package lab6;

import java.util.Date;

	public class Account {

		private int id;
		private double balance;
		private static double annualInterestRate;
		private Date dateCreated;

		Account() {
			id = 0;
			balance = 0;
			annualInterestRate = 0;
			dateCreated = new Date(); 
		}

		//creates an account based on the values put in by user an gets the date of said creation
		Account(int specifiedId, double initialBalance) {
			id = specifiedId;
			balance = initialBalance;
			dateCreated = new Date();
		}

		//setters
		//sets the id
		public void setId(int userId) {
			id = userId;
		}

		//sets the balance
		public void setBalance(double userBalance) {
			balance = userBalance;
		}

		//sets the annual interest rate
		public void setAnnualInterestRate(double userAnnualInterestRate) {
			annualInterestRate = userAnnualInterestRate;
		}
		
		//getters to pull user info
		// gets the id
		/** Return id */
		public int getId() {
			return id;
		}

		//gets the balance
		public double getBalance() {
			return balance;
		}

		//gets the annual interest rate
		public double getAnnualInterestRate() {
			return annualInterestRate;
		}

		//gets the date of the transaction
		public String getDateCreated() {
			return dateCreated.toString();
		}

		//gets the monthly interest rate by diving by the number of months in a year
		public double getMonthlyInterestRate() {
			return annualInterestRate / 12;
		}

		// Methods to calculate transactions
		//gets the monthly interest by dividing the monthly rate by 100 
		public double getMonthlyInterest() {
			return balance * (getMonthlyInterestRate() / 100);
		}

		//method to withdraw cash
		public void withdraw(double uservalue) {
			balance -= uservalue;
		}

		//method to deposit cash
		public void deposit(double uservalue) {
			balance += uservalue;
	}
}
