import java.util.Scanner;

public class problem7_19 {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//prompt user for size and then the contents
		System.out.print("Enter the size of the list: ");
		System.out.print("Enter the contents of the list: ");
		int listlength = input.nextInt();
		//create an array for user values
		int[] list = new int[listlength];
		for (int i = 0; i < listlength; i++)
			list[i] = input.nextInt();

		// Displays whether the list is sorted or not.
		System.out.println("The list has" + listlength + "integers" +  list);
		System.out.println(
			"The list is " + (isSorted(list) ? "already " : "not ") + "sorted");
	}
 // determines if the next number is less than the previous one
	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1])
				return false;
		}
		return true;
	}
}