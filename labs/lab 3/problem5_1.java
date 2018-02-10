import java.util.Scanner;

public class problem5_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int positives = 0; 	
		int negatives = 0; 	
		int count = 0;			
		long total = 0;		

		System.out.print("Enter an integer, the input ends if it is 0: ");
		int usernum = input.nextInt();

		if (usernum == 0) {	
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		}

		while (usernum != 0) {
			if (usernum > 0)
				positives++;	
			else
				negatives++;	
			total += usernum;	
			count++;				
			usernum = input.nextInt();
		}

		long average = total / count;

		System.out.print(
			"The number of positive is " + positives + 
			"The number of negatives is " + negatives +
			"The total is total " + total +
			"The average is " + average);
	}
}