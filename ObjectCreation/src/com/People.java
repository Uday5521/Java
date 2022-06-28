package com;

public class People {
	
	
	long phonenumber = 9888232314l;
	
	public static void main(String[] args) {
		
		People p = new People();
		People p1 = new People();
		People p2 = new People();
		People p3 = new People();

		System.out.println(p1.phonenumber);//9888232314
		System.out.println(p.phonenumber);//9888232314
		System.out.println(p2.phonenumber);//9888232314
		System.out.println(p3.phonenumber);//9888232314
		
	}

}
