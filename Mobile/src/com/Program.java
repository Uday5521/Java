package com;

public class Program {
	public static void main(String[] args) {
		//Variable declaration and Intalization
		int x =10;
		int y =20;
		int z =30;
		System.out.println("X value: "+x);//10
		System.out.println("Y value: "+y);//20
		System.out.println("Z value: "+z);//30
		System.out.println("-----------------------");
		
		//Variable re-intialaization
		y =x;
		z=y;
		System.out.println("Y value: "+y);//10
		System.out.println("Z value: "+z);//10
	}

}
