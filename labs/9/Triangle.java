//implement the triangle class from previous lab
public class Triangle 
		extends GeometricObject {
	//create each side data field
	private double side1;
	private double side2;
	private double side3;
   //create default triangle with 1 for each side
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	public Triangle(double side1, double side2, double side3) 
	//implement the illegaltriangleexception class here
		throws IllegalTriangleException {
		if (side1 + side2 <= side3 ||  side2 + side3 <= side1 || side1 + side3 <= side2) 
			throw new IllegalTriangleException(side1, side2, side3);
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
    //area formula
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
    //perimeter formula
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
    //string description
	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
			" side3 = " + side3;
	}
}
