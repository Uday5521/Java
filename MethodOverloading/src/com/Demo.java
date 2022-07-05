package com;

public class Demo {

	void display(int age) {
		System.out.println(age);
	}

	void display(double height) {
		System.out.println(height);
	}

	void display(double height, int age) {
		System.out.println(height);
		System.out.println(age);
	}
	
	void display(int x, String y){
		System.out.println(x+ " "+y);
	}
	
	void display(String y, int x){
		System.out.println(y+ " "+x);
	}

}
