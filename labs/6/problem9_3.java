package lab6;

import java.util.Date;

public class problem9_3 {
	public static void main(String[] args) {
		
		Date testdate = new Date();
		//create loop to run 10000 all the way to 100000000000 or 1e to the 11 
		for (long i = 10000; i <= 1e11; i *= 10) {
			testdate.setTime(i); //set the time
			System.out.println(testdate.toString()); //print out the date using the toString() method
		}
	}
}
