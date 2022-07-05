package com;

import java.util.Scanner;

public class squareroot {
//25->5  49->7 48->
	static   void       checkperfectsqure  (double x)
//	static retruntype   MEthodName          Passing Arguments
	
	{
		double square = Math.sqrt(x);
		System.out.println(square);
	}
		
	public static void main(String[] args)//main method
	{
		System.out.println("Enter any number");//understanding purpose we are using print statement
		
		Scanner s = new Scanner(System.in);
		
		double number = s.nextDouble();
		
		checkperfectsqure(number);
	}
}
