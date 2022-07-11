package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Demo d = new Demo();
		
		for(int i=1; i<=4; i++)
		//1<=4 T print->1 1++ = 2
		//2<=4 T print->2 2++ = 3
		//3<=4 T print->3 3++ = 4
		//4<=4 T print->4 4++ = 5
		//5<=4 False
 		{
			System.out.println("Enter Number: ");
			int num = s.nextInt();
			
			d.checkEvenOrOdd(num);
			System.out.println("-----");
		}
		
	}

}
