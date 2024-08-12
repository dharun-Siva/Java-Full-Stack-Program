package com.dharun;

public class TypesOfMethods {
	void myMethod1() {
		System.out.println("Instance or Object Method ");
	}
	
	static void myMethod2() {
		System.out.println("static or class Method");
	}
	public static void main(String [] args) {
		TypesOfMethods tom = new TypesOfMethods();
		tom.myMethod1();
		
		TypesOfMethods.myMethod2();
	}
}
