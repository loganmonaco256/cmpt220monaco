import java.util.Scanner;

public class problem4_13 {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a character : ");
			
			char ch = input.next( ).charAt(0);	 
			
			if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U')
			{
			System.out.println("Entered character "+ ch +" is a Vowel"); 
			}
			else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
				System.out.println("Entered character "+ch+" is a Consonant");
			      else
				System.out.println("Not in the alphabet");		
			}

	}

