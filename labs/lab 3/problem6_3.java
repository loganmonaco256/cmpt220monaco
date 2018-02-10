import java.util.Scanner;//import a scanner
	public class problem6_3 {
		//main method to prompt user and give an answer
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in); // Create a Scanner

			// Prompt the user to enter an integer
			System.out.print("Enter an integer: ");
			int number = input.nextInt();

			// tells user that it is or is not a palindrome      true       false
			System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
				"a palindrome.");
		}

		//palidrome method, returns true or false
		public static boolean isPalindrome(int number) {
			return number == reverse(number) ? true : false;
		}

		//method to reverse a number by using string
		public static int reverse(int number) {
			String reverse = ""; 	//creates a placehold for the reverse string
			String stringnum = number + ""; //turns number into a string
			// Reverse string
			for (int i = stringnum.length() - 1; i >= 0; i--) {
				reverse += stringnum.charAt(i);
			}
			return Integer.parseInt(reverse); // Return reversed integer
		}
}