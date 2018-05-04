import java.util.Scanner;

public class MovieRental {

	public static void reserveMovie() {
		// The count for each movie rented by user
		int movie0 = 0;
		int movie1 = 0;
		int movie2 = 0;
		int movie3 = 0;
		int movie4 = 0;
		int movie5 = 0;
		// array of movies and their corresponding number in store
		int[] movieList = new int[5];
		movieList[0] = 4;
		movieList[1] = 6;
		movieList[2] = 2;
		movieList[3] = 1;
		movieList[4] = 3;
		movieList[5] = 0;
		Scanner input = new Scanner(System.in);
		//get birth year for R rated movies
		System.out.println("Please enter your birth year in 4 numbers (1995):  ");
		long year = input.nextLong();
		//ask user which movie they want to rent
		System.out.println("Please select the movie you would like to reserve at our store: 0 for Iron Man, 1 for The Hunger Games, 2 for Titanic, 3 for The Purge, 4 for The Avengers: Infinity War, 5 for It, 6 to exit to main menu and review your selections. ");
		//create variable for switch statement on movie choices
		int movie = input.nextInt();
		//create the switch statement for all choices
		switch(movie) {
		case 0: 
			int choice0;
			//check if there are copies in store
			if(movieList[0] > 0) {
				//ask user if they want to reserve a copy
				System.out.println("We have " + movieList[0] + "copies of this movie in our store, would you like to reserve one? 1 for yes 0 for no");
				choice0 = input.nextInt();
				if(choice0 == 1) {
					//deduct from array and add movie to user acc
					movieList[0] = movieList[0] - 1;
					movie0 ++;
					reserveMovie();
				} else {
					//if no is chosen
					System.out.println("No reservation was chosen, returning to movie rental choices.");
					reserveMovie();	
				}
			} else {
				// if no movie is available
				System.out.println("We do not have any more copies of that movie availiable, sorry!");
				reserveMovie();
			}
			break;
		case 1: 
			int choice1;
			if(movieList[1] > 0) {
				System.out.println("We have " + movieList[1] + "copies of this movie in our store, would you like to reserve one? 1 for yes 0 for no");
				choice1 = input.nextInt();
				if(choice1 == 1) {
					movieList[1] = movieList[1] - 1;
					movie1 ++;
					reserveMovie();
				} else {
					System.out.println("No reservation was chosen, returning to movie rental choices.");
					reserveMovie();	
				}
			} else {
				System.out.println("We do not have any more copies of that movie availiable, sorry!");
				reserveMovie();
			}
			break;
		case 2: 
			int choice2;
			if(movieList[2] > 0) {
				System.out.println("We have " + movieList[2] + "copies of this movie in our store, would you like to reserve one? 1 for yes 0 for no");
				choice2 = input.nextInt();
				if(choice2 == 1) {
					movieList[2] = movieList[2] - 1;
					movie2 ++;
					reserveMovie();
				} else {
					System.out.println("No reservation was chosen, returning to movie rental choices.");
					reserveMovie();	
				}
				} else {
				System.out.println("We do not have any more copies of that movie availiable, sorry!");
				reserveMovie();
			}
			break;
		case 3: 
			int choice3;
			if(movieList[3] > 0) {
				System.out.println("We have " + movieList[3] + "copies of this movie in our store, would you like to reserve one? 1 for yes 0 for no");
				choice3 = input.nextInt();
				// added check on the users age for an R rated movie
				if(choice3 == 1 && year < 2000) {
					movieList[3] = movieList[3] - 1;
					movie3 ++;
					reserveMovie();
				} else {
					System.out.println("No reservation was chosen or you are too young to see this movie, returning to movie rental choices.");
					reserveMovie();	
				}
			} else {
				System.out.println("We do not have any more copies of that movie availiable, sorry");
				reserveMovie();
			}
			break;
		case 4: 
			int choice4;
			if(movieList[4] > 0) {
				System.out.println("We have " + movieList[4] + "copies of this movie in our store, would you like to reserve one? 1 for yes 0 for no");
				choice4 = input.nextInt();
				if(choice4 == 1) {
					movieList[4] = movieList[4] - 1;
					movie4 ++;
					reserveMovie();
				} else {
					System.out.println("No reservation was chosen, returning to movie rental choices.");
					reserveMovie();	
				}
			} else {
				System.out.println("We do not have anymore copies of that movie availiable, sorry!");
				reserveMovie();
			}
			break;
		case 5: 
			int choice5;
			if(movieList[5] > 0) {
				System.out.println("We have " + movieList[5] + "copies of this movie in our store, would you like to reserve one? 1 for yes 0 for no");
				choice5 = input.nextInt();
				if(choice5 == 1 && year < 2000) {
					movieList[5] = movieList[5] - 1;
					movie5 ++;
					reserveMovie();
				} else {
					System.out.println("No reservation was chosen or you are too young to see this movie, returning to movie rental choices.");
					reserveMovie();	
				}
			} else {
				System.out.println("We do no have anymore copies of that movie availiable, sorry!");
				reserveMovie();
			}
			break;
		case 6:
			//when user chooses 6 at the start of reserveMovie(), print their total count for each movie and send them to the main menu
			System.out.println("Thank you for using our reservation system, your total number of reservations for each movie are as follows: /n Iron Man: " + movie0 + "/n The Hunger Games: " + movie1 + "/n The Titanic: " + movie2 + "/n The Purge: " + movie3 + "/n The Avengers: Infinity War: " + movie4 + "/n It: " + movie5);
			displayMainMenu();
			break;
		default:
			System.out.println("Sorry, your input was invalid, please try again.");
			reserveMovie();
		}
		
	}
	public static void checkRental() {
		int days = 0;
		//get the total days user has rented movie for
		System.out.println("Please indicate the total number of days that your rental has been out of the store: ");
		Scanner input = new Scanner(System.in);
		days = input.nextInt();
		//if its under 30 tell them how many days they have left
		if (days < 30 && days > 0) {
			days = 30 - days;
			System.out.println("Your rental has the following number of days until it will become overdue: " + days + ". Everyday beyond this point will result in a growing fee up to 50 dollars.");
			displayMainMenu();
			//if days is 30 or over, calculate the cost up to the max 50 dollars
		} else if (days >= 30) {
			 int overdueFee = 0;
			 int daysOverThirty = 0;
			 daysOverThirty = days - 30;
			 if (daysOverThirty < 11) {
				 overdueFee = 4 * daysOverThirty + 10;
				 System.out.println("Your rental is overdue. The cost of returning your rental is " + overdueFee + ".");
				 displayMainMenu();
			 } else {
				 //if movie is over 10 days late from the 30 day period, print default message of 50 dollar charge
				 System.out.println("Your movie is overdue by 10 days or more, to return the movie, you will pay a fixed price of 50 dollars");
				 displayMainMenu();
			 }
		 } else {
			 //print when user has entered an non number
			 System.out.println("Sorry, that input is not a valid input, please select a number.");
			 checkRental();
		 }
	}
	public static void displayMainMenu() {
		//introduction screen for the system
		System.out.println("Welcome to our movie reservation system!");
		//main menu options
		System.out.print("\n Main menu \n 1: Reserve a Movie \n2: Check on current rental \n 3: Exit program \n Enter a choice: ");
		// create a switch for the different options
		System.out.println("Please enter one of the given numbers to access that option: ");
		Scanner input = new Scanner(System.in);
		
		int accessnum = input.nextInt();
		
		switch(accessnum) {
			case 1:	 
				reserveMovie();
				break;
			case 2:
				checkRental();
				break;
			case 3:
				//when user is done with the program
				System.exit(0);
				break;
			default:
				System.out.println("You did not enter a valid number, returning to main menu.");
				displayMainMenu();
		}
	}	
}
		
