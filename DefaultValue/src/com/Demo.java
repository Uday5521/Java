package com;

public class Demo {
	
	double a;
	char c;
	boolean d;
	String e;
	float f;
	
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		System.out.println("Double value : "+demo.a);//0.0
		System.out.println("Char value : "+demo.c);//empty
		System.out.println("Boolean value : "+demo.d);//false
		System.out.println("String value : "+demo.e);//null
		System.out.println("Float value : "+demo.f);//0.0
		
	}

}
