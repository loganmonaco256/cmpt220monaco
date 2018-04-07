import java.util.Scanner;

public class Problem12_5 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a color: ");
		String color = input.next();

		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		boolean exceptionOccured = true;
		//repeat until user enters correct sides
		while (exceptionOccured == true) {
			// Prompt the user to enter three sides of the triangle
			System.out.print("Enter three side of the triangle: ");
			double side1 = input.nextDouble();		
			double side2 = input.nextDouble();		
			double side3 = input.nextDouble();
	
			try {
				// Create triangle object with user input
				Triangle triangle = new Triangle(side1, side2, side3);
				//exception did not happen while loop stops
				exceptionOccured = false;
				
				triangle.setColor(color);
				triangle.setFilled(filled);
		
				System.out.println(triangle.toString());
				System.out.println("Area: " + triangle.getArea());
				System.out.println("Perimeter: " + triangle.getPerimeter());
				System.out.println("Color: " + triangle.getColor());
				System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
					+ "filled");
			}
			catch (IllegalTriangleException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}