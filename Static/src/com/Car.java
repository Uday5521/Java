package com;

public class Car {
	
	static int cost = 10;
	public static void main(String[] args) {
		
		System.out.println(cost);//Car.cost
		
		cost = 20;
		System.out.println(cost);//Car.cost
		System.out.println("----------");
		
		Car c = new Car();
		System.out.println(c.cost);//not a good practice
		
	}
	

}
