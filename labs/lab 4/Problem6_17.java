import java.util.Scanner;

public class Problem6_17 {
//main class
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an n value for an nxn matrix: "); //prompt user for n value
		int n = input.nextInt(); //set n to input 
		printMatrix(n); //call the printMatrix method
	}
//print matrix class
	public static void printMatrix(int n) {
		for ( int i = 0; i < n; i++) { //creates the rows
			for ( int j = 0; j < n; j++) { // creates the columns 
			System.out.print((int)(Math.random() * 2)); //generates a random int between 0 and 1
		}
			System.out.println(); // creates a line between each set of 3 values
	}
}
}