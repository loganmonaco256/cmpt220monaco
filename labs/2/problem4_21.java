import java.util.Scanner;//import scanner object

public class problem4_21 {

	public static void main(String[] args) {
		//create a scanner object
		Scanner input = new Scanner(System.in);

		// Have user enter a Social Security number
		System.out.print("Enter a Social Security Number: ");
		String SSnumber = input.nextLine();

		boolean isAnSSNumber =
				
				(SSnumber.length() == 11) && 
				(Character.isDigit(SSnumber.charAt(0))) &&
				(Character.isDigit(SSnumber.charAt(1))) &&
				(Character.isDigit(SSnumber.charAt(2))) &&
				(SSnumber.charAt(3) == '-') &&
				(Character.isDigit(SSnumber.charAt(4))) &&
				(Character.isDigit(SSnumber.charAt(5))) &&
				(Character.isDigit(SSnumber.charAt(7))) &&
				(SSnumber.charAt(6) == '-') &&
				(Character.isDigit(SSnumber.charAt(8))) &&
				(Character.isDigit(SSnumber.charAt(9))) &&
				(Character.isDigit(SSnumber.charAt(10)));

			// Print the resulting boolean outcome, ie true or false
			System.out.println(SSnumber + " is " + ((isAnSSNumber) ? "a valid " : "an invalid ")
				+ "social security number");
		}
	}