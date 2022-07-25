package com;

public class Dinga 
	{
		Dinga()
		{
			System.out.println(1);
		}
		
			Dinga(int x)
				{
					this();
						{
							System.out.println(2);
						}
				}
		public static void main(String[] args)
		{
			System.out.println("start");
			
				new Dinga(10);
				
				System.out.println("end");
			
		}
	}	
