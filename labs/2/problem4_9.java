import java.util.Scanner;//import scanner object

public class problem4_9 {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in); //create scanner object

			// Have user enter a character
			System.out.print("Enter a character: ");
			String userchar = input.nextLine();
			char ch = userchar.charAt(0);
			
			// Display Unicode of character
			System.out.println((int)ch);
			}

	}
