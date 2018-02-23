import java.util.Scanner;

public class problem8_11 {

	public static void main(String[] args) {
		//gather user number and print result
		  Scanner input = new Scanner(System.in);
		  int number = input.nextInt();
	      char[][] matrix = makeMatrix(number);
	      System.out.print(matrix);
	}
	//place H and T in the matrix
			public static char[][] makeMatrix(int number) {
	        char[][] matrix = new char[3][3];
	        for (int i = 2; i >= 0; i--) {
	            for (int j = 2; j >= 0; j--) {
	                matrix[i][j] = number % 2 == 1 ? 'T' : 'H';
	                number /= 2;
	            }
	        }
	        return matrix;

	}

}
