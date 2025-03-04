//create the IllegalTriangleException class to catch exception in the Triangle class
public class IllegalTriangleException 
extends Exception {
	private double side1;
	private double side2;
	private double side3;

	//Illegal Triangle Exception method
	public IllegalTriangleException(double side1, double side2, double side3) {
		//printed to the user upon side length catch
		super("The following sides are illegal " + side1 + " " + side2 + " " + side3);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}
	//getters
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
}