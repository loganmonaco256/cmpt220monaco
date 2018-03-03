package lab6;

import java.util.Scanner;

public class testcaseproblem9_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of rows and columns in the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
//creates a 2 by 2 array with user values 
		double[][] array = new double[rows][columns]; 
		System.out.println("Enter values for a 2 by 2 array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		//gets an instance of locatelargest from class location
		Location maximumvalue = locateLargest(array);

		// Display the location of said value
		System.out.println("The location of the largest element in the array is " + maximumvalue.maxValue + " at (" + maximumvalue.row + ", " + maximumvalue.column + ")");
	}
	//calls the location class and its method locatelargest which applies to a 2 by 2 array
	public static Location locateLargest(double[][] a) {
		return new Location(a);
	}
}

