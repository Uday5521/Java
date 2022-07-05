package com;

public class MainClass {
	public static void main(String[] args) {

		Demo d = new Demo();

		d.display(60.0);
		System.out.println("----------------");
		d.display(23);
		System.out.println("----------------");
		d.display(70.0, 22);
		System.out.println("----------------");
		d.display(4, "hello world");
		System.out.println("----------------");
		d.display("Hello", 9);
	}

}
