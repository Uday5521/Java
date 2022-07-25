package com;

public class Employee {
	
	Employee(int id) {
		 this("TOM");
		 System.out.println("ID: "+id);
	}
	
	Employee(String name) {
		System.out.println("Name: "+name);
	}
	
	Employee(double salary){
		this(25);
		System.out.println("Salary: "+salary);
	}
	public static void main(String[] args) {
		new Employee(50000.00);
	}

}
