
public class Problem6_13 {

	public static void main(String[] args) {
		System.out.printf("%-10s%10s\n", "i", "m(i)");
		System.out.println("____________________");
		for (double i = 1; i <= 20; i++) {
			System.out.printf("%-10.1f%10.4f\n", i, sumSeries(i));
			}
		}
		public static double sumSeries(double number) {
			double sum = 0;
			for (double j = 1; j <= number; j++) {
				sum += j / (j + 1);
			}
			return sum;
		}
	}
	
