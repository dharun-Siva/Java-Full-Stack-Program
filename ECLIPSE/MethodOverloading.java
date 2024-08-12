package com.dharun;

public class MethodOverloading {
	void myMethod (String name) {
		System.out.println("Welcome " + name);
		
	}
	
	void myMethod(int a, int b) {
		System.out.println("Addition : " + (a + b));
		
	}
	
	void myMethod (int n) {
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact= fact * i;
		}
		System.out.println("factorial : "+ fact);
	}
	
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.myMethod(5);
		mo.myMethod("Dharun ");
		mo.myMethod(10, 20);
	}

}
