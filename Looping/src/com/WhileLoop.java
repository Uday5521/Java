package com;

public class WhileLoop {
	public static void main(String[] args) {
		int n = 1;
		while (n <= 10) {
			System.out.println(n);
			n++;
		}
		// 1<=5 true 1
		// 2<=5 true 2
		// 3<=5 true 3
		// 4<=5 true 4
		// 5<=5 true 5
		// 6<=5 false
		System.out.println("------------------------");
		int i = 5;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		// 5>=1 true 5
		// 4>=1 true 4
		// 3>=1 true 3
		// 2>=1 true 2
		// 1>=1 true 1
		// 0>=1 false
		System.out.println("--------------------");
		int x = 10;
		while (x <= 5) // false
		{
			System.out.println(x);
			x++;
		}
	}
}
