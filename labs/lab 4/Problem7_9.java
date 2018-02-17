import java.util.Scanner;

public class Problem7_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner
		double[] numbers = new double[10]; // Create array of length 10

		// Prompt the user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
			System.out.println("The minimum number is: " + min(numbers));//print out the minimum number
		}
	}
	//calculate the minimum value of an array
		public static double min(double[] array) {
			double minimum = array[0];
			for(double i = 0; i < array.length - 1; i++);
			if (array[i] < minimum) {
				minimum = array[i];
				return minimum;
			}
		}

	}

