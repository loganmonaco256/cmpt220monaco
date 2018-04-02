import java.util.Scanner;

	public class Exercise11_1Test {
		
		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);

			// Prompt the user to enter 3 sides for a triangle
			System.out.print("Enter the three sides of your triangle: ");
			double side1 = input.nextDouble();		
			double side2 = input.nextDouble();		
			double side3 = input.nextDouble();

			// Prompt the user to enter the color of the triangle
			System.out.print("Enter a color: ");
			String trianglecolor = input.next();

			// Prompt the user to enter whether the triangle is filled
			System.out.print("Is the triangle filled? Answer true or false");
			boolean filled = input.nextBoolean();

			// Create a triangle with the user's input
			Triangle triangle = new Triangle(side1, side2, side3);
			triangle.setColor(trianglecolor);
			triangle.setFilled(filled);
			
            //display the triangle result
			System.out.println(triangle.toString());
			System.out.println("Area: " + triangle.getArea());
			System.out.println("Perimeter: " + triangle.getPerimeter());
			System.out.println("Color: " + triangle.getColor());
			System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
				+ "filled");
		}
	}

