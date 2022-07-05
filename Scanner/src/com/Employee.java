package com;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Age: ");
		int age = scan.nextInt();

		System.out.println("Enter Name: ");
		String name = scan.next();

		System.out.println("Enter Salary: ");
		double salary = scan.nextDouble();

		System.out.println("Enter Gender: ");
		char gender = scan.next().charAt(0);

		System.out.println("Age is " + age);
		System.out.println("Name is " + name);
		System.out.println("Salary is " + salary);
		System.out.println("Gender is " + gender);
	}

}
