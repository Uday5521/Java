package com;

public class Example {
	public static void main(String[] args) {
		
		System.out.println("Hello");
		main(10);
		main(20.0);
		main("Hai");
		System.out.println("Bye");
	}
	
	 static void main(int a){
		System.out.println(a);
	}

	 static void main(double b){
		System.out.println(b);
	}


	 static void main(String c){
		System.out.println(c);
	}
}
