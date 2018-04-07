import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem12_11 {

    public static void main(String[] args) {
    	//command line arg check
        if (args.length != 2) {
            System.out.println("Invalid command line arg");
            System.out.println("Usage: Java assignment 12_11");
            System.exit(1);
        }

        // Check if it exists
        File filename = new File(args[1]);
        if (!filename.exists()) {
            System.out.println(args[1] + " does not exist.");
            System.out.println(2);
        }

        // create input and output files
        //create a string that will be deleted
        String stringToDelete = "";
        try {
            Scanner input = new Scanner(filename);
            while (input.hasNext()) {
                stringToDelete += input.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        stringToDelete = stringToDelete.replaceAll(args[0], " ");
        
    }
}