import java.util.Scanner;//import scanner object

public class problem4_23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//create scanner object
		
		//prompt user for each category then enter them in variables
		String name = " ";
		System.out.println("Enter employee's name: ");
		name = input.nextLine();
		System.out.println("Enter number of hours worked in a week: ");
		double hoursworked = input.nextDouble();
		System.out.println("Enter hourly pay rate: ");
		double hourlyrate = input.nextDouble();
		System.out.println("Enter federal tax withholding rate: ");
		double fedwithrate = input.nextDouble();
		System.out.println("Enter state tax withholding rate: ");
		double statewithrate = input.nextDouble();
		
		//calculate the values needed to compete form
		double grosspay = hourlyrate *hoursworked;
		double fedwithholding = fedwithrate * grosspay;
		double statewithholding = statewithrate * grosspay;
		double totaldeduction = (fedwithholding + statewithholding);
		double netpay = grosspay - (totaldeduction);
		
		//display the table of values for employee
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hoursworked);
		System.out.println("Pay Rate: " + hourlyrate);
		System.out.println("Gross Pay: " + grosspay);
		System.out.println("Deductions: ");
		System.out.println("Federal Withholding " + "(" + fedwithrate + "%) :" + fedwithholding);
		System.out.println("State Withholding " + "(" + statewithrate + "%) :" + statewithholding);
		System.out.println("Total Deduction: " + totaldeduction);
		System.out.println("Net Pay: " + netpay);
		
		

	}

}
