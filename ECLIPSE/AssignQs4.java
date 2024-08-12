package com.dharun;


class Circle {
	
	double radius;
	
	Circle(double radius) {
		this.radius = radius;
		
	}
	
	void AreaOfCircle() {
		
		double area = 3.14 * radius * radius;
		System.out.println("Area of Circle : " + area);
		
	}
	void CircumferenceOfCircle () {
		
		double circumference = 2 * 3.14 * radius;
		System.out.println("Circumferenc of Circle : " + circumference);
	}
}
public class AssignQs4 {
	public static void main(String [] args) {
		Circle c = new Circle(4);
		
		c.AreaOfCircle();
		c.CircumferenceOfCircle();
		
	}

}
