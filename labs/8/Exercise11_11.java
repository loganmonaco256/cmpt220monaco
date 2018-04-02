import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_11 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// create a list but with integers this time
		
		ArrayList<Integer> numberlist = new ArrayList<Integer>();

		// user enters 5 numbers and they are added to an array length 5
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			numberlist.add(input.nextInt());
		}

		//utilize the sort method within arraylist util on list
		sort(numberlist);

		// Display list in increasing order
		System.out.println(numberlist.toString());
	}
	
	//method called to sort the array of integers
	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);		
	}
}