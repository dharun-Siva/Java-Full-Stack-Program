package com.dharun;

public class thisKeyword {
	
	//this is a keyword in java to refer current class object.
	
	String name;
	
	thisKeyword(String name) {
		
		this(10,20);
		this.name=name;
		this.greeting();
	}
	
	thisKeyword(int a, int b) {
		System.out.println("Sum : " + (a + b));
	}
	
	void greeting() {
		System.out.println("Welcome " + name);
	}
	public static void main(String [] args) {
		thisKeyword tk = new thisKeyword("Dharun Siva !");
	}
}
