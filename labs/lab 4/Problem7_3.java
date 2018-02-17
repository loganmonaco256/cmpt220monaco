import java.util.Scanner;

public class Problem7_3 {
	
	public static void main(String[] args) {
		int[] repcount = new int[100]; 
		System.out.print("Enter the integers between 1 and 100: ");
		countmethod(repcount);
		for (int i = 0; i < repcount.length; i++) {
			if (repcount[i] > 0)
				System.out.println((i + 1) + " occurs " + repcount[i] +
					" time");
			else if (repcount[i] > 1) {
				System.out.println((i + 1) + " occurs " + repcount[i] +
						" times");
			}
		}
	}
	
		public static void countmethod(int[] repcount){
			Scanner input = new Scanner(System.in);
			int usernum; 
			usernum = input.nextInt();
			while(usernum != 0) {
			if (usernum >= 1 && usernum <= 100)	{
					repcount[usernum - 1]++;
			}
		}
	}
}