package com;

public class Student {

	int age;

	Student(int a) {
		age = 10;
	}

	public static void main(String[] args) {

		Student s = new Student(45);
		System.out.println(s.age);
		
		Student s1 = new Student(21);
		System.out.println(s1.age);
		
		Student s2 = new Student(89);
		System.out.println(s2.age);
	}
}
