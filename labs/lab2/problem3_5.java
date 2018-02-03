import java.util.Scanner;

public class problem3_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//creates scanner
		
		//prompt user and save value under day
		System.out.print("Please enter a day of the week: 0 for sunday, 1 for monday, 2 for teusday, and so on: ");
		System.out.print("Enter the number of days elapsed since today: ");
		
		int day = input.nextInt();
		int daysafter = input.nextInt();
		int newday = day + daysafter;
				
		while (newday > 6) {
			newday = newday - 7;
		}
	
		if (newday == 0) {
			System.out.println("The day will be a Sunday");
		} 
		else if (newday == 1) {
			System.out.println("The day will be a Monday");
		}
		else if (newday == 2) {
			System.out.println("The day will be a Teusday");
		}
		else if (newday == 3) {
			System.out.println("The day will be a Wednesday");	
		}
		else if (newday == 4) {
			System.out.println("The day will be a Thursday");
		}
		else if (newday == 5) {
			System.out.println("The day will be a Friday");
		}
		else if (newday == 6) {
			System.out.println("The day will be a Saturday");
		}
		else {
			System.out.println("Sorry one of your values was not a number");
		}
			

	}

}
