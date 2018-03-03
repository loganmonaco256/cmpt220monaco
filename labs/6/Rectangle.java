package lab6;

public class Rectangle {
	double width;//set var width
	double height;//set var height
	
	
	Rectangle() {
		width = 1; //assign a value of 1
		height = 1; //assign a value of 1
		
	} 
	// create a constructor to create a triangle of specific proportions
	Rectangle(double specifiedwidth, double specifiedheight) {
		width = specifiedwidth;
		height = specifiedheight;
		
	}
	//get area method
	double getArea() {
		return width * height; 
	
	//get perimeter method
	}
	double getPerimeter() {
		return (height + width) * 2;
	}
}
