package com;

public class LargestOfThreeNumbers {
	public static void main(String[] args) {
		int a = 10;
		int b = 100;
		int c = 700;

		System.out.println("a: " + a + " b: " + b + " c: " + c);

		if (a > b)// false
		{
			if (a > c) {
				System.out.println(a + " a is largest");
			} else {
				System.out.println(c + " c is largest");
			}
		} else if (b > c)// false
		{
			System.out.println(b + " b is largest");
		} else {
			System.out.println(c + " c is largest");
		}
	}

}
