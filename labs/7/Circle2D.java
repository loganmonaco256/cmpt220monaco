//package lab7;

public class Circle2D {
	private double x; 
	private double y; 
	private double radius;
//default circle
	Circle2D() {
		this(0, 0, 1);
	}
//specified circle
	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
//get x
	public double getX() {
		return x;
	}
//get y
	public double getY() {
		return y;
	}
//get radius
	public double getRadius() {
		return radius;
	}
//get area
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
//get perimeter
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
//boolean to see if point is on circle
	public boolean contains(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2) +  Math.pow(y - this.y, 2))  < radius;
	}
//sees if specified circle is in this circle
	public boolean contains(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) <= radius - circle.getRadius(); // JA
	}
//checks if there is overlap
	public boolean overlaps(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) +  Math.pow(circle.getY() - y, 2))  <= radius + circle.getRadius();
	}
}

