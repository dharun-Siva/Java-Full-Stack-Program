package com.dharun;

//Types of variables in Java

public class MyClass1 {
	int b=20; //Instance or Object Variable
	static int c=30;  //Static or class variable
	
	public static void main(String [] args) {
		int a=10; //Local Variable
		System.out.println("Local Variable : " + a);
		
		MyClass1 obj = new MyClass1();
		System.out.println("Instance Variable : "+ obj.b);
		
		System.out.println("Static or Class Variable "+MyClass1.c);
	}

}
