package com;

public class Demo {

	//Method without Arguments and without return statement
	void display() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		System.out.println("Start");
		
		Demo d = new Demo();
		
		d.display();//Calling or invoking the method
		
		System.out.println("end");
	}

}
