import java.util.Scanner;

public class ConvertFToC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a temperature in Farenheit: ");
		double farenheit = input.nextDouble();
		
		double celsius = 5.0 / 9 * (farenheit - 32);
	
		System.out.println("The temperature in celsius is: " + celsius);
	
	}
}
