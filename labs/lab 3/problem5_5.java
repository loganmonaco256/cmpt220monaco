public class problem5_5 {
	public static void main(String[] args) {
		// sets a value to convert between pounds and kilograms
		final double pounds_in_a_kilogram = 2.2;

		// Show the tables heading
		System.out.println(
			"Kilograms    Pounds     |     Pounds      Kilograms");
		//create a loop that contains the restrictions for both tables
		for (int k = 1, j = 20; k <= 199 && j <= 515; k += 2, j += 5) {
			//print out a row of the left side of the table
			System.out.printf(
				"%-12d%7.1f", k, (k * pounds_in_a_kilogram));
			System.out.print("     |     "); //seperates the two tables values
			//print out a row of the right side of the table
			System.out.printf(
				"%-9d%12.2f\n",
				j, (j / pounds_in_a_kilogram));
		}
	}
}