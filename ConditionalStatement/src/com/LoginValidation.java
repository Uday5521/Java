package com;

public class LoginValidation {
	public static void main(String[] args) {
		String id = "adminxyz";
		int password = 123;
		
		if(id == "adminxyz"){
			System.out.println("User Id is Valid");
			if(password == 123){
				System.out.println("Password is Valid");
				System.out.println("Login Succesful");
			}
			else{
				System.out.println("Password is Invalid");
				System.out.println("Login Unsuccessful");
			}
		}
		else{
			System.out.println("User Id is Invalid");
			System.out.println("Login Unsuccessfull");
		}
	}

}
