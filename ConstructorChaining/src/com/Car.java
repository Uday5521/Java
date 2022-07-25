package com;

public class Car {
	
	Car(){
		System.out.println("first car");
	}
	
	Car(int a){
		this();
		{
			System.out.println("second car");
		}
	}
	
	public static void main(String[] args) {
		
		new Car(50);
	}

}
