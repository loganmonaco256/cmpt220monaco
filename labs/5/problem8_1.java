import java.util.Scanner;

public class problem8_1 {

	 public static void main(String[] args) {
	        double[][] usermatrix = getMatrix(3, 4);
	        for (int i = 0; i < usermatrix[0].length; i++) {
	            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(usermatrix, i));
	        }
	    }

	    public static double[][] getMatrix(int rows, int columns){
	        Scanner scanner = new Scanner(System.in);
	        double[][] matrix = new double[rows][columns];
	        System.out.println("Enter a 3-by-4 matrix row by row:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                matrix[i][j] = scanner.nextDouble();
	            }
	        }
	        return matrix;
	    }

	    public static double sumColumn(double[][] m, int columnIndex) {
			double sum = 0;
			for (int row = 0; row < m.length; row++) {
				sum += m[row][columnIndex];		
			}
			return sum;
		}
}
		

