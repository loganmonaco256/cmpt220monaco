public class Problem13_11 {

	public static void main(String[] args) throws CloneNotSupportedException {
		//create a new octagon object with a set side length
		Octagon octagon1 = new Octagon(8);

		//area and perimeter
		System.out.println("Octogon area, perimeter:");
		System.out.println("/nArea: " + octagon1.getArea() + "\nPerimeter: " + octagon1.getPerimeter());

		// Create new object using the clone method
		System.out.println("Octagon will be cloned and used in comparison to the first octagon.");
		Octagon octagon2 = (Octagon)octagon1.clone();

		// Compare the octagons using compareTo
		int result = (octagon1.compareTo(octagon2));
		if (result == 1)
			System.out.println("Octagon is greather than its clone.");
		else if (result == -1)
			System.out.println("Octagon is less than its clone."); 
		else
			System.out.println("Octagon is equal to its clone.");
	}
}