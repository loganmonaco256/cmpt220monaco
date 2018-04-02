public class Triangle 
		extends GeometricObject {
	
	private double side1;
	private double side2;
	private double side3;

	/// construct a default triangle
	Triangle() {
		side1 = side2 = side3 = 1.0;
	}

    //construct a 3 sided triangle
	
	Triangle(double side1, double side2, double side3) { 
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
//return each side
	
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	// get the area
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		//from problem 2.19
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	// get the perimeter
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	// string description of the triangle called based on text example
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
			" side3 = " + side3;
	}
}
