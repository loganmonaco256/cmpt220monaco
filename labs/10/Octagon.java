public class Octagon extends GeometricObject 
		implements Cloneable, Comparable<Octagon> {
	
	private double side;
	//create the object
	public Octagon() {
	}
	//create octagon with a specific side value
	public Octagon(double side) {
		this.side = side;
	}
	//set side value
	public void setSide(double side) {
		this.side = side;
	}
	//get side value
	public double getSide() {
		return side;
	}

	@Override 
	//area of an octagon from textbook
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	@Override 
	//perimeter found by adding up all sides
	public double getPerimeter() {
		return 8 * side;
	}

	@Override 
	//implement compareTo using area as a comparison
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	@Override 
public Object clone() throws CloneNotSupportedException {
	return super.clone();
    }

	@Override
	//string description overrided from GeometricObject
	public String toString() {
		return super.toString() + "Area: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}