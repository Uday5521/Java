package com;

public class Demo {
	public static void main(String[] args) {
		
		//Array Declaration
		int[] a;
		
		
		//Array Creation 
		a = new int[3];
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("------------------");
		
		//Array Initialization
		a[0] = 10;
		a[1] = 20;
		a[2] = 40;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("Length: "+a.length);
		System.out.println("=====================");
		
		//Array Declaration and creation
		double[] x = new double[4];
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		
		x[0]=1.2;
		x[1]=3.4;
		x[2]=5.6;
		x[3]=7.8;
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println("Length: "+x.length);
	}

}
