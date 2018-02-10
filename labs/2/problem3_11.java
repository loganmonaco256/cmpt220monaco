import java.util.Scanner; //import scanner

public class problem3_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//create scanner object
		
		int daysinthemonth = 0; //create an int value for the days in the month
		String monthname = " "; //create a string for the name of the corresponding month
		
		//prompt user
		System.out.println("Enter a number value corresponding to a month: ");
		int month = input.nextInt();
		
		System.out.println("Enter a year A.D.: ");
		int year = input.nextInt();
		
		//create a switch to assign a value based on response from user
		switch (month) {
			case 1:
				monthname = "January";
				daysinthemonth = 31;
				break;
			case 2:
				monthname = "February";
				//create a conditional if to determine if the year is a leap year or not
				if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
					daysinthemonth = 29;
				} else {
					daysinthemonth = 28;
				}
				break;
			case 3:
				monthname = "March";
				daysinthemonth = 31;
				break;
			case 4:
				monthname = "April";
				daysinthemonth = 30;
				break;
			case 5:
				monthname = "May";
				daysinthemonth = 31;
				break;
			case 6:
				monthname = "June";
				daysinthemonth = 30;
				break;
			case 7:
				monthname = "July";
				daysinthemonth = 31;
				break;
			case 8:
				monthname = "August";
				daysinthemonth = 31;
				break;
			case 9:
				monthname = "September";
				daysinthemonth = 30;
				break;
			case 10:
				monthname = "October";
				daysinthemonth = 31;
				break;
			case 11:
				monthname = "November";
				daysinthemonth = 30;
				break;
			case 12:
				monthname = "December";
				daysinthemonth = 31;
				break;
				// prints if the user did not enter a value between 1 and 12
			default:
				System.out.println("Sorry, you have entered a value that does not correspond to a calender month, please try again.");
				break;
				}
		//print out the answer
		System.out.print(monthname + " , " + year + " will have exactly " + daysinthemonth + " days");
		}
		

	}

