public class Circle

		extends GeometricObject implements Comparable<Circle> {
	//create radius var
	private double radius;
	//default circle object
	public Circle() {
	}
	//circle object with set value for radius
	public Circle(double radius) {
		this.radius = radius;
	}
	//circle object with radius, color and isfilled boolean
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	//gets radius
	public double getRadius() {
		return radius;
	}
    //sets radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//finds the area using pi r squared
	@Override 
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getDiameter() {
		return 2 * radius;
	}
	//finds perimeter using 2 pi r squared
	@Override 
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	@Override 
	//override the equals method from GeoObject, compares two radii and sees if they are the same
	public boolean equals(Object o) {
		return this.compareTo((Circle) o) == 0;
	}

	@Override 
	// implement the comparable interface
	public int compareTo(Circle o) {
		if (this.radius > o.radius)
			return 1;
		else if (this.radius < o.radius)
			return -1;
		else
			return 0;
	}
	//returns the circles info in string form
	@Override 
	public String toString() {
		return super.toString() + "Date created: " + getDateCreated() +"\nRadius: " + radius;
	}
}