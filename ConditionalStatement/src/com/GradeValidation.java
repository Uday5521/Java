package com;

public class GradeValidation {
	public static void main(String[] args) {
		{
			char grade = 'A';
			switch (grade) {
			case 'A':
				System.out.println("Excellent -> Distinciton");
				break;
			case 'B':
				System.out.println("Good -> FirstClass");
				break;
			case 'C':
				System.out.println("Bad -> Fail");
				break;
			default:
				System.out.println("Invalid Grade");

			}
		}
	}

}
