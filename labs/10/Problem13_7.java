public class Problem13_7 {
	
	public static void main(String[] args) {
		//create the array of squares using Square class and implementing the GeometricObject abstract class
		GeometricObject[] arrayOfSquares = {new Square(5), new Square(7), new Square(9.3), new Square(14), new Square(13.6)};
		//run through the array displaying the different squares areas and howToColor method
		for (int i = 0; i < arrayOfSquares.length; i++) {
			System.out.println("Square number : " + (i + 1));
		 	System.out.println("Its area is : " + arrayOfSquares[i].getArea());
		 	System.out.print("Can be colored by doing this : ");
			((Square)arrayOfSquares[i]).howToColor();
		 } 
	}
}
