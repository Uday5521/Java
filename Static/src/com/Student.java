package com;

public class Student {
	
		static int age = 20;//static variable
		
	static void study()//static Method
	{
			System.out.println("Studing");
		}
		
	public static void main(String[] args) {
		System.out.println("Age is: "+Student.age);
		Student.study();
		System.out.println("------------");
		System.out.println(age);//20
		//ClassName.variableName -> ClassName.age -> Student.age
		study();//ClassName.methodName ->
		//ClassName.study -> Student.study()
		
	}

}
