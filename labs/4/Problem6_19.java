import java.util.Scanner;

public class Problem6_19 {
//main method to print the answers and take user input
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three values for sides of a triangle: "); //prompt user
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		System.out.println(isValid(side1, side2, side3) ? "The area of your valid triangle, from Heron's formula is:  " + area(side1, side2, side3) : "Input is invalid, two sides exceed the other side.");//print the boolean from isValid
	}
	//method to determine validity of triangle 
	public static boolean isValid(double side1, double side2, double side3) {
		boolean validtriangle = side1 + side2 > side3 && side3 +side2 > side1 && side1 + side3 > side2;
		return validtriangle;
	}
	//method that uses Heron's formula to calculate a triangle area given three sides with no base
	public static double area(double side1, double side2, double side3) {
		double heronvalue = (side1 + side2 + side3) / 2;
		return Math.sqrt(heronvalue * (heronvalue - side1) * (heronvalue - side2) * (heronvalue - side3));
	}
}
