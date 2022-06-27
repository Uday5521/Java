package com;

public class NestedForLoop {
	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++)
		{
			for(int j=5; j<=6; j++)
			{
				System.out.println("i: "+i);
				System.out.println("j: "+j);
			}
			System.out.println("--------------------------");
		}
//		1<=3 true 1
//		2<=3 true 2
//		3<=3 true 3
//		4<=4 false
//		
//		5<=6 true 5
//		6<=6 true 6
//		7<=6 false
		
		System.out.println("=============================");
		for(int i=1; i<=5; i++)//1 2 3 4 5
		{
			for(int j=1; j<=5; j++)//1 2 3 4 5
			{
				System.out.print("* ");//10 20 15
			}
			System.out.println();
		}
	}

}
