import java.util.Scanner;
import java.util.Random;

public class problem3_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number (0 for rock, 1 for paper, and 2 for scissors): ");
		int playernum = input.nextInt();
		int computernum = (int)(Math.random() * 3);
		
		if (playernum == 0 && computernum == 0) {
			System.out.println("The computer plays rock. You play rock. Tie!");
		} else if (playernum == 0 && computernum == 1) {
			System.out.println("The computer plays paper. You play rock. Computer wins!");
		} else if (playernum == 0 && computernum == 2) {
			System.out.println("The computer plays scissors. You play rock. You win!");
		} else if (playernum == 1 && computernum == 0) {
			System.out.println("The computer plays rock. You play paper. You win!");
		} else if (playernum == 1 && computernum == 1) {
			System.out.println("The computer plays paper. You play paper. Tie!");
		} else if (playernum == 1 && computernum == 2) {
			System.out.println("The computer plays scissors. You play paper. Computer wins!");
		} else if (playernum == 2 && computernum == 0) {
			System.out.println("The computer plays rock. You play scissors. Computer wins!");
		} else if (playernum == 2 && computernum == 1) {
			System.out.println("The computer plays paper. You play scissors. You win!");
		} else if (playernum == 2 && computernum == 2) {
			System.out.println("The computer plays scissors. You play scissors. Tie!");
		} else {
			System.out.println("Invalid user input.");
		}
		
	}
				
		

}


