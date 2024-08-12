package com.dharun;


//Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

class Rectangle {
	double width;
	double height;
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	void AreaOfRectangle() {
		
		double area = width * height;
		System.out.println("Area of Rectangle : " + area);
		
	}
	void PerimeterOfRectangle () {
		
		double perimeter = 2 * (width + height);
		System.out.println("Perimeter of Rectangle : " + perimeter);
	}
}

public class AssignQn3 {
	public static void main(String [] args) {
		Rectangle r = new Rectangle(7,2);
		r.AreaOfRectangle();
		r.PerimeterOfRectangle();
		
		
	}

}
