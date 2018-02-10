
public class problem6_1 {

	public static void main(String[] args) {
		int i = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 10 == 0) 
				System.out.printf("%7d\n", getPentagonalNumber(i));
			else
				System.out.printf("%7d", getPentagonalNumber(i));
		}
	}
	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1)) / 2;
}
}