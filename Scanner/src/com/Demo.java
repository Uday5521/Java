package com;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter First No:");
		int a = s.nextInt();

		System.out.println("Enter Second No:");
		int b = s.nextInt();

		int sum = a + b;

		System.out.println("Sum: " + sum);

	}

}
