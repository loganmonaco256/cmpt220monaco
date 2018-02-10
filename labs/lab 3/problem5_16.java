import java.util.Scanner;//import scanner

public class problem5_16 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//create scanner

		// ask user to enter an integer value
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		int index = 2; //smallest prime number to increase for each factoring 

		// Find and display all the smallest factors in increasing order
		while (number / index != 1) { //tests to see if the value of index is the number
			
			// Test index as a factor of number
			if (number % index  == 0) {
				System.out.print(index + ", ");
				number /= index; 
			}
			else
				index++; // Increment index
		}
		
		System.out.println(number + ".");
	}
}