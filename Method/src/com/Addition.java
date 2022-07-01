package com;

public class Addition {
//Method with Arguments and without return statement
	void add(int a, int b) {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("Sum of a+b: " + (a + b));
	}

	public static void main(String[] args) {
		Addition obj = new Addition();

		obj.add(10, 5);
		System.out.println("----------------");
		obj.add(6, 3);
		System.out.println("----------------");
		obj.add(123, 456);
	}

}
