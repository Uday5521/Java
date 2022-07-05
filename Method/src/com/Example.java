package com;

public class Example {
	//Method with Arguments and with return statement
	 int findSquare(int n)//5
	{
		return n*n;//5*5 = 25
	}
	//7 7.0
	public static void main(String[] args) {
		Example e = new Example();
		
		int result = e.findSquare(5);
		System.out.println(result);//25
		
		System.out.println(e.findSquare(4));
		
	}

}
