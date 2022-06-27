package com;

public class MatrimonyPortal {
	public static void main(String[] args) {
		char gender = 'F';
		int age = 16;

		if (gender == 'M') {
			System.out.println("Gender is Male");

			if (age >= 21) {
				System.out.println("Yes, you can get Married");
			} else {
				System.out.println("Have Patience");
			}

		} else if (gender == 'F') {
			System.out.println("Gender is Female");
		}
		if (age >= 21) {
			System.out.println("Yes, you can get Married");
		} else {
			System.out.println("Have Patience");
		}
	}
}
