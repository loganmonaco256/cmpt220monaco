//use geometric object class from book/previous lab
public class GeometricObject {
	
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	//getter for color
	public String getColor() {
		return color;
	}
	//setter for color
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	//create a new date with java util
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	//string representation
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
}