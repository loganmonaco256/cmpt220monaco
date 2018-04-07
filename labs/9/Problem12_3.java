import java.util.*;

public class Problem12_3{
	
	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//call method
		int[] array = createArray();

		System.out.print("Enter the index of the array: ");
		
		//try to print the users array
		try {
			System.out.println("The array length is " + array[input.nextInt()]);
		}
		//catch the error for an out of bounds limit
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
	}
    //method to create an array of 100 random integers
	public static int[] createArray() {
		int[] newarray = new int[100];
		for (int i = 0; i < newarray.length; i++) {
			newarray[i] = (int)(Math.random() * 100) + 1;
		}
		return newarray;
	}
}
