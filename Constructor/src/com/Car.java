package com;

public class Car
	{
	
	//Non Parameterized User defined
		Car()
		{
			System.out.println("In Car");
		}
		
		public static void main(String[] args)
		{
			System.out.println("Start");//start
			
			new Car();//In Car
			new Car();//In Car
			new Car();//In Car
			new Car();//In Car
			new Car();//In Car
			
			System.out.println("end");//end
		}

}
