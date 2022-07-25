package com;

public class Student {
	
	Student(String subject){
		System.out.println("Subject: "+subject);
	}
	
	Student(String subject,int marks){
		this(subject);
		System.out.println("Marks: "+marks);
	}

	public static void main(String[] args) {
		
		new Student("Java",75);
	}
}
