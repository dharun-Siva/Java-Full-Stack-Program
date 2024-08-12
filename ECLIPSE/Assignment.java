package com.dharun;
import java.util.*;

class Student {
	int studentRegNo;
	String studentName;
	int arr[]= new int[5];

	
	Student(int studentRegno, String studentName) {
		this.studentRegNo=studentRegno;
		this.studentName=studentName;
		
	}
		void getMarks() {
			Scanner s= new Scanner (System.in);
			for(int i=0;i<5;i++)
			{
				arr[i]=s.nextInt();
			}
			
		}
		void displayGrade() {
			int sum=0;
			int avg=0;
			System.out.println("Student Register No :" + studentRegNo);
			System.out.println("Student Name :" + studentName);
			for(int i=0;i<5;i++)
			{
				
				 sum+=arr[i];
				 
			}
			avg=sum/5;
				 
				 if(avg <= 50)
				 {
					 System.out.println("Student Grade : U");
				 }
				 else if(avg >= 51 && avg <= 60 )
				 {
					 System.out.println("Student Grade : C");
				 }
				 else if(avg >= 61 && avg <= 70 )
				 {
					 System.out.println("Student Grade : B");
				 }
				 else if(avg >= 71 && avg <= 80 )
				 {
					 System.out.println("Student Grade : B+");
				 }
				 else if(avg >= 81 && avg <= 90 )
				 {
					 System.out.println("Student Grade : A");
				 }
				 else if(avg >= 91 && avg <= 95 )
				 {
					 System.out.println("Student Grade : A+");
				 }
				 else if(avg >= 96 && avg <= 100 )
				 {
					 System.out.println("Student Grade : O");
				 }
			}
		
}

public class Assignment {
	public static void main (String [] args) {
		Student obj= new Student(101,"Dharun");
		obj.getMarks();
		obj.displayGrade();
	}
}
