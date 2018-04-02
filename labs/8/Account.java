// most of code found from exercise 9.7 as per the assignment instructions
import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	
	// create a default (0,0) account
	Account() {
		this(0, 0); 
	}

	// method to create an account with a specified id and balance
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		//sets a default interest rate and new date for creation of acc
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	// setters for new account
	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	//getters for account
	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public String getDateCreated() {
		return dateCreated.toString();
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
    
	//method to get the monthly interest
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	// decreases the account by a set amount 
	public void withdraw(double amount) {
		balance -= amount;
	}
    //increases account by a set amount
	public void deposit(double amount) {
		balance += amount;
	}
    // string description of account class
	public String toString() {
		return "Account ID: " + id + 
				"\n The Date created: " + getDateCreated()
			+ "\n Balance:  $" + String.format("%.5f", balance) + 
			"\n Monthly interest:  $" + String.format("%.5f", getMonthlyInterest());
	}
}
