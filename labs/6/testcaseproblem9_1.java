//package lab6;

public class testcaseproblem9_1 {
	
	public static void main(String[] args) {
		// Create a Rectangle with width 4 and height 40
		Rectangle rectangle1 = new Rectangle(4, 40);

		// Create a Rectangle with width 3.5 and height 35.9
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);

		// Display the width, height, area, and perimeter of rectangle1
		System.out.println("Rectangle 1 has a width of "+ rectangle1.width + "and a height of " + rectangle1.height + "and an area of " + rectangle1.getArea() + "and a perimeter of " + rectangle1.getPerimeter());
	
		// Display the width, height, area, and perimeter of rectangle2
		System.out.println("Rectangle 2 has a width of "+ rectangle2.width + "and a height of " + rectangle2.height + "and an area of " + rectangle2.getArea() + "and a perimeter of " + rectangle2.getPerimeter());
		
	}
}

