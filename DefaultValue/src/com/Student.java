package com;

public class Student {
	
	String name;
	int marks;
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1.name+" "+s1.marks);//null 0
		System.out.println(s2.name+" "+s2.marks);//null 0
		System.out.println("----------------");
		
		s1.name = "TOM";
		s1.marks = 36;
		
		s2.name = "Jerry";
		s2.marks = 40;

		System.out.println(s1.name+" "+s1.marks);//TOM 36
		System.out.println(s2.name+" "+s2.marks);//Jerry 40
		System.out.println("----------------");

		System.out.println(s1.name+" has scored "+s1.marks+" marks in Java");
		System.out.println(s2.name+" has scored "+s2.marks+" marks in Java");
	}

}
