import java.util.Scanner; //imports a scanner object

public class CalculateTip {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Creates a new Scanner 

		// Asks user to enter values for subtotal and gratuity rate
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();

		// Calculates the gratuity amount and then find the total by adding rate to subtotal
		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;

		// Shows the resulting values
		System.out.println("The gratuity is $" + gratuity +
			" and total is $" + total);
	}
}