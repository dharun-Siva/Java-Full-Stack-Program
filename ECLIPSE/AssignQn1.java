package com.dharun;

//Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age
class Person {
	String personName;
	int personAge;
	
	Person(String personName, int personAge) {
		this.personName = personName;
		this.personAge = personAge;
		
	}
	void display() {
		System.out.println("Person Name : " + personName);
		System.out.println("Person Age : "+ personAge);
	}
}
public class AssignQn1 {
	public static void main(String[] args) {
		Person p = new Person("Dharun",25);
		p.display();
	}
}
