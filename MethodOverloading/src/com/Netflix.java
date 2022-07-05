package com;

public class Netflix {
	
	//Netflix email id and password or phno and password
	void login(String id, int password){
		System.out.println("Logged in using email id and password");
	}

	void login(int phonenumber, int otp){
		System.out.println("Logged in using phonenumber and otp");
	}
	
	public static void main(String[] args) {
		
		Netflix n = new Netflix();
		n.login(987654345, 578234);
		n.login("Tom@gmail.com", 123);
		
	}
}
