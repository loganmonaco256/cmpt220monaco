import java.util.Date;
import java.util.Scanner;

public class Project2 extends MovieRental {
	//users info variables
	private static String username;
	private static String password;
	private static long accountNum;
	private static Date dateCreated;
	//main method
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a username and then a password");
		//get all of users account info
		username = input.nextLine();
		password = input.nextLine();
		accountNum = (long) Math.floor(Math.random() * 5000);
		dateCreated = new Date(); 
		//show user there account info
		printAccountInfo();
		
		System.out.println("Your Account info has been registered, thank you.");
		
		displayMainMenu();
	}
	public static void printAccountInfo() {
		//prints out all variables for their account and a the date it was made
		System.out.print("The final account info after all reserved movies that is stored in our system is as follows: " + 
		"/n Username: " + username + "/n Password: " + password + "/n Account Number: " + accountNum + "/n Day account transaction and creation occured: " + dateCreated);
	}
}

