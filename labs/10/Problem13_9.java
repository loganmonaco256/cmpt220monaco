public class Problem13_9 {
	
	public static void main(String[] args) {
		//create three new circle objects
		Circle circle1 = new Circle(4, "yellow", true);
		Circle circle2 = new Circle(5, "blue", false);
		Circle circle3 = new Circle(3, "orange", true);
		Circle circle4 = new Circle(5, "blue", true);
		//display the radii
		System.out.println("Circle 1 has a radius of : " + circle1.getRadius());
		System.out.println("Circle 2 has a radius of : " + circle2.getRadius());
		System.out.println("Circle 3 has a radius of : " + circle3.getRadius());
		System.out.println("Circle 4 has a radius of : " + circle4.getRadius());

		System.out.println("Circle 1 is " + (circle1.equals(circle3) ? "" : "not ") +
			"equal to circle 2");

		System.out.println("Circle 2 is " + (circle1.equals(circle4) ? "" : "not ") +
			"equal to circle 3");
	}
}