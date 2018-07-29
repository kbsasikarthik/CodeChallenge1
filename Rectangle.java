package codechallenge1Day9;

//import java.util.Scanner;

public class Rectangle {
	
	private double length;
	private double width;
	
	// default constructor
	public Rectangle() {
	}
	// constructor with parameters
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	//Scanner sc = new Scanner(System.in);
	
	// getter and setter for length
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	// getter and setter for width
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	/*	
	// overloaded toString method
	public String toString() {
		return "This is a rectangle!";
	}*/
	
	public double getArea() {
		return length*width;
	}
	
	public double getPerimeter() {
		return (2*length)+(2*width);
	}

}
