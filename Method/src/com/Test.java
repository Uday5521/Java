package com;

public class Test {
	// Method Without Argument and with return type
	double display() {
		return 10.0;
	}

	public static void main(String[] args) {
		System.out.println("Start");

		Test t = new Test();
		
		System.out.println(t.display());

		System.out.println("end");
	}

}
