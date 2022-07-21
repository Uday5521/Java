package com;

public class Employee {
	
	double salary;
	
	Employee(int id){
		salary = 50000.00;
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee(1);
		System.out.println(e.salary);
		
		Employee e1 = new Employee(2);
		System.out.println(e1.salary);
		
		Employee e2 = new Employee(2);
		System.out.println(e2.salary);
	}

}
