import java.util.Scanner;//import scanner

public class problem6_5 {
	// main method to take user numbers and place them into displaysortednumbers
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create Scanner

		// Prompt the user to enter three numbers
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		// Put user numbers into the sorting method
		displaySortedNumbers(number1, number2, number3);
	}

	//create a sorting algorithm
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double temp; // Hold number to swap
		
		if (num2 < num1 && num2 < num3){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		else if (num3 < num1 && num3 < num2) {
			temp = num1; 
			num1 = num3;
			num3 = temp;
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		// print out the 3 numbers in ascending order
		System.out.println(num1 + " " + num2 + " " + num3);
	}
}
