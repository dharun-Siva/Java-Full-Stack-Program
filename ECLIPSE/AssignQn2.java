package com.dharun;

//Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values  

class Dog {
	String dogName;
	String dogBreed;
	
	Dog(String dogName, String dogBreed) {
		this.dogName = dogName;
		this.dogBreed = dogBreed;
	}
	
	void set(String dogName, String dogBreed) {
		this.dogName = dogName;
		this.dogBreed = dogBreed;
		
		System.out.println("Dog Name : " + dogName);
		System.out.println("Dog Breed : " + dogBreed);
	}
}
public class AssignQn2 {
	public static void main(String [] args)
	{
		Dog d = new Dog("Subbu","Chippy");
		d.set("Gimmy", "Pomerian");
		d.set("Subramani", "GermanShepered");
		
	}

}
