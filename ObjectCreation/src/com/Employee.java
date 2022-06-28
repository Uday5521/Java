package com;

public class Employee {
	int age = 23;
	String name = "TOM";
	double salary = 50000.00;
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		System.out.println(e.age);
		System.out.println(e.name);
		System.out.println(e.salary);
	}

}
