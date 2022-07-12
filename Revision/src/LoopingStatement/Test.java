package LoopingStatement;

public class Test {
	public static void main(String[] args) {

		// write program to display only even number between 1 to 100

		for (int i = 1; i <= 100; i++) {
			if(i%2 == 0)
			System.out.println(i);
		}
		System.out.println("--------------------");
		//write a program to display number between 1 to 100 which are divisible
		// by both 2 and 5
		for(int i=1; i<=100; i++){
			if(i%2==0 && i%5==0 ){
				System.out.println(i);
			}
		}
	}
}
