import java.util.Scanner; //import scanner object

public class problem3_2 {

	public static void main(String[] args) {
		// create three random integers
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 10 % 10);
		int number3 = (int)(System.currentTimeMillis() / 100 % 10);

		//Create the scanner
		Scanner input = new Scanner(System.in);
		//prompt user for answer to question
		
		System.out.print("What is " + number1 + "+" + number2 + "+" + number3 + "?");
		int answer = input.nextInt();
		
		//output answer to user
		System.out.println(number1 + "+" + number2 + "+" + number3 + " = " + answer + " is " +  (number1 + number2 + number3 == answer));
		
	}

}
