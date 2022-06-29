package com;

public class Car {
	int cost = 10;// Variable declare and Intialization

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();

		System.out.println(c1.cost);// 10
		System.out.println(c2.cost);// 10
		System.out.println("--------------");

		c1.cost = 15;// Using Reference variable Reintialization
		c2.cost = 25;// Using Reference variable Reintialization

		System.out.println(c1.cost);// 15
		System.out.println(c2.cost);// 25
		System.out.println("--------------");

		c1.cost = 50;// Using Reference variable Reintialization
		c2.cost = 100;// Using Reference variable Reintialization

		System.out.println(c1.cost);// 50
		System.out.println(c2.cost);// 100

	}

}
