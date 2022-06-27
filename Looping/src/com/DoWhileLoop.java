package com;

public class DoWhileLoop {
	public static void main(String[] args) {

		int x = 1;
		do {
			System.out.println(x);
			x++;
		} while (x <= 5);

		// 1->2 2<=5 true
		// 2->3 3<=5 true
		// 3->4 4<=5 true
		// 4->5 5<=5 true
		// 5->6 6<=5 false
System.out.println("------------------");

		int j = 5;
		do {
			System.out.println(j);
			j--;
		} while (j >= 1);
		System.out.println("------------------");
		
		int k = 10;
		do {
			System.out.println(k);
			k++;
		} while (k <= 5);

	}
}