
//Create an ArrayList of rectangles or circles. Find the largest one (by area) and print the dimensions or radius.
// Also find smallest.
// code challenge 1 from Darby & Sasi
package codechallenge1Day9;

import java.util.ArrayList;

import week2.Rectangle;

public class CodeChallenge1 {

	public static void main(String[] args) {
		// create an object using a default constructor and set values for the object using setters
		Rectangle sun = new Rectangle();
		sun.setLength(12.5);
		sun.setWidth(4.3);
		
		// create objects by calling constructor with arguments and set values for objects
		Rectangle snug = new Rectangle(15.2,30.5);
		Rectangle green = new Rectangle(10,6.8);
		Rectangle annex = new Rectangle(7.8,9.2);
		Rectangle penthouse = new Rectangle(18.7,24.1);
				
		// create an ArrayList that holds objects of Rectangle
		ArrayList<Rectangle> rectangleList = new ArrayList<>();
		
		// add objects to the ArrayList
		rectangleList.add(sun);
		rectangleList.add(snug);
		rectangleList.add(green);
		rectangleList.add(annex);
		rectangleList.add(penthouse);
		
		// declare variables to hold area, largest area and smallest area
		double areaRoom=0, largeArea=Double.MIN_VALUE, smallArea=Double.MAX_VALUE;
		
		// loop through each element in the ArrayList and get area of that object using its getArea() method
		// also finds the largest area and smallest area of all
		for(Rectangle rectangle:rectangleList) {
			areaRoom=rectangle.getArea();
			if(areaRoom>=largeArea) {
				largeArea = areaRoom; // finding largest area
			}else if(areaRoom<=smallArea) {
				smallArea=areaRoom; // finding smallest area
			}
		}
		// Print the area of the Sun room
		System.out.println("Area of Sun Room is "+rectangleList.get(0).getArea());
		
		// print the largest and smallest area among the rooms
		System.out.printf("\n%s%.2f\n","The largest area among the rooms  - ",largeArea);
		System.out.printf("%s%.2f\n","The smallest area among the rooms - ",smallArea);
		
	
	}

}
