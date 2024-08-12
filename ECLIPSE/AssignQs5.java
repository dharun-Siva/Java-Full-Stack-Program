package com.dharun;

class Book {
	String bookTitle;
	String bookAuthor;
	int ISBN;
	
	Book(String bookTitle, String bookAuthor, int ISBN) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.ISBN = ISBN;
	}
	void display() {
		System.out.println("Book Title : "+ bookTitle);
		System.out.println("Book Author : "+ bookAuthor);
		System.out.println("Book ISBN : "+ ISBN);
		
	}
}
public class AssignQs5 {
	public static void main(String [] args)
	{
		Book b= new Book("C Programming","James Pond",1027);
		b.display();
		
		
	}
}
