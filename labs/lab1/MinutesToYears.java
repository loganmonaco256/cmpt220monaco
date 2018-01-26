import java.util.Scanner;//import the scanner object

public class MinutesToYears {

    public static void main(String[] Strings) {
    	Scanner input = new Scanner(System.in); //create the scanner object
    	System.out.print("Input the number of minutes: ");// ask user for number of minutes
    	 
    	double minutesInYear = 60 * 24 * 365; // save a value for minutes in a year
        double userminutes = input.nextDouble(); // take the users minutes value

        // calculate the years and days from the users input
        long years = (long) (userminutes / minutesInYear);
        int days = (int) (userminutes / 60 / 24) % 365;
        // print out the answer
        System.out.println((int) userminutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}

