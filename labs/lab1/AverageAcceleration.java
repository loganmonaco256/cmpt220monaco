import java.util.Scanner; // import a scanner object

public class AverageAcceleration {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //create a scanner object
		System.out.println("Enter V0, V1, and t: "); //prompt the user
		
		// create variables from user input
		double initialV = input.nextDouble();
		double endV = input.nextDouble();
		double time = input.nextDouble();
		
		//calculate average acceleration
		double avgAccel = (initialV - endV) / time;
		
		//display result to 2 decimals
		System.out.println("The average acceleration is: " + (int)(avgAccel * 100) / 100.0);
		
	}

}
