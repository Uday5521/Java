package com;

import java.util.Scanner;

public class Addition {
	//Subtraction Multiplication Division Modulus and Squareroot

	void add(int x, int y) {
		System.out.println("Sum of " + x + " and " + y + " is " + (x + y));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Addition obj = new Addition();
		Addition obj1 = new Addition();
		Addition obj2 = new Addition();
		
		System.out.println("Enter a value: ");
		int a = s.nextInt();

		
		System.out.println("Enter b value: ");
		int b = s.nextInt();

		obj.add(a, b);
		obj1.add(a, b);
		obj2.add(a, b);
		
		

	}
}
