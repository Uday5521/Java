package com;

public class NestedIf {
	public static void main(String[] args) {

		int a = 70;

		if (a <= 90) //70<=10  False
		{
			System.out.println("Inside Outer If");

			if (a == 5) {
				System.out.println("a is equal to 5");
			} else {
				System.out.println("a is not equal to 5");
			}
		} else {
			System.out.println("a greater than 10");
		}
	}

}
