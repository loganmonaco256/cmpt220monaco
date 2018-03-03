package lab6;

import java.util.GregorianCalendar;

public class problem9_5 {
	
	public static void main(String[] args) {
	// Creates the GregorianCalendar object
	GregorianCalendar calender = new GregorianCalendar();
	//displays the current date on the gregorian calender
	System.out.println("The current date, displayed in the order month, day, year");
	System.out.println(calender.get(calender.MONTH) + "/" + calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));
	
	//finds specified elapsed time since jan 1st 1970
	calender.setTimeInMillis(1234567898765L);
		
	//display the time since January 1st, 1970
	System.out.println("The date in the format month, day in the month, year for the date January 1st, 1970");
	System.out.println(calender.get(calender.MONTH) + "/" + calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));

}
}