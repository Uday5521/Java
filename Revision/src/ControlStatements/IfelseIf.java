package ControlStatements;

public class IfelseIf {
	public static void main(String[] args) {
		int marks = 101;
		if(marks>79 && marks<=100){
			System.out.println("first Class distinction");
		}
		else if(marks>=60 && marks<=79){
			System.out.println("first class");
		}
		else if(marks>=50 && marks<=59){
			System.out.println("second class");
		}
		else if(marks>=35 && marks<=49){
			System.out.println("third class");
		}
		else if(marks>100){
			System.out.println("Invalid number");
		}
		else{
			System.out.println("Fail");
		}
	}
}
