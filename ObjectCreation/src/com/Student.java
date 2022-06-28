package com;

public class Student {
	
	int age = 20;//non static variables
	 String name = "Dinga";//non static variables
	 String address = "bangalore";//non static variables
	 
	public static void main(String[] args) {
		 
		 Student     s            = new Student();//Object Creation
	//ClassName referenceVariable = new Classname();
		 
		 System.out.println("Student age is "+s.age);
		 System.out.println("Student name is "+s.name);
		 System.out.println("Student address is "+s.address);
		
	}

}
