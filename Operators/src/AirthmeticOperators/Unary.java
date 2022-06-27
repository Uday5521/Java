package AirthmeticOperators;

public class Unary {
	public static void main(String[] args) {

		int x = 5;
		System.out.println("X: " + x);// 5

		x++;
		System.out.println("X: " + x);// 6

		x++;
		System.out.println("X: " + x);// 7

		System.out.println("-------------------");

		x--;
		System.out.println("X: " + x);// 6

		x--;
		System.out.println("X: " + x);// 5

		System.out.println("===========================");

		int i = 40;
		int j = i++; // PostIncrement ->First Assign then Increment

		System.out.println(i);
		System.out.println(j);
		System.out.println(i + " " + j);
		System.out.println("-------------------");

		int a = 5;
		int b = --a; // predecrement ->First decrement

		System.out.println(a);// 4
		System.out.println(b);// 4
		System.out.println(a + " " + b);
	}

}
