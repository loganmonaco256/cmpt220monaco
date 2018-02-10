
public class problem5_13 {

	public static void main(String[] args) {
		int n = 0;
		while (Math.pow(n + 1, 3) < 12000) {
			n++;
		}
			System.out.println("The largest value of n such that n^3 is less than 12000 is " + n + ".");
		
	}

}
