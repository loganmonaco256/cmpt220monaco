import java.util.Scanner;

public class Problem7_5 {
	public static void main(String[] args) {
		java.util.Scanner input = new Scanner(System.in);//create scanner
		System.out.print("Enter Ten Numbers: ");//prompt user
		
		int[] values = new int[10]; //create an array for distinct values

		int count = 0;//sets distinct number count
			//checks for a new distinct value 
        	for (int i=0; i<10; i++){
        		int usernumber = input.nextInt();
        		boolean distinctnum = true;
        	//checks for a repeat number 
        	for (int j=0; j<count; j++){

            	if (usernumber == values[j]){
            		distinctnum = false;
            		break;	
            	}
            }
        	//adds the new number to the list of distinct values
            if (distinctnum) { 
            	values[count++] = usernumber;
            }

  }
        	System.out.println("");
        	System.out.print("The Distinct Numbers are: ");
        	//prints out the distinct numbers
        	for (int i=0; i<count; i++){               
        		System.out.print(values[i]+ " ");

                }

                System.out.println(""); 

        }
}
