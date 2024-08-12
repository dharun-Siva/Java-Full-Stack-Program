package com.dharun;

class Emp {
	String empName;
	String empJobTitle;
	double empSalary;
	
	Emp(String empName, String empJobTitle, double empSalary) {
		this.empName = empName;
		this.empJobTitle = empJobTitle;
		this.empSalary = empSalary;
	}
	void set(double empSalary) {
		this.empSalary = empSalary;
	}
	void display() {
		System.out.println("Employee Name : "+ empName);
		System.out.println("Employee JobTitle : "+ empJobTitle);
		System.out.println("Employee Salary : "+ empSalary);
		
	}
}
public class AssignQn6 {
	public static void main(String [] args)
	{
		Emp e= new Emp("Dharun","Software Developer",25000);
		e.set(50000);
		e.display();
		
		
	}
}
