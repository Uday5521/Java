package com;

public class LOThreeNumbers {
	public static void main(String[] args) {
		int a = 900;
		int b = 100;
		int c = 700;

		if(a>b && a>c){
			System.out.println("a is Largest");
		}
		else if(b>a && b>c){
			System.out.println("b is Largest");
		}
		else{
			System.out.println("c is Largest");
		}
	}

}
