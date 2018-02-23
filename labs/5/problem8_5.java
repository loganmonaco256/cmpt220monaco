import java.util.Scanner;

public class problem8_5 {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 //create two matrices from user input
		 int[][] matrixone = new int[3][3];
		 int[][] matrixtwo = new int[3][3];
		 System.out.println("Enter the first matrix");
		 for (int i = 0; i < 3; i++) {
			 for (int j = 0; j < 3; j++) {
				 matrixone[i][j] = input.nextInt();
        }
    }
		 System.out.println("Enter the second matrix");
		 for (int i = 0; i < 3; i++) {
			 for (int j = 0; j < 3; j++) {
				 matrixtwo[i][j] = input.nextInt();
        }
    }//add the two together
		 int[][] matrixthree = new int[3][3];
		 for (int i = 0; i < 3; i++) {
			 for (int j = 0; j < 3; j++) {
				 matrixthree[i][j] = matrixone[i][j] + matrixtwo[i][j];
        }
    }
		 //print the result
		 System.out.print("The matrices are added as follows");
		 System.out.print(matrixone + "    +    ");
		 System.out.print(matrixtwo + "    =    ");
		 System.out.print(matrixthree + " ");
		 
}
}

