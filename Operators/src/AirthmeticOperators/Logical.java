package AirthmeticOperators;

public class Logical {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		boolean result = a < b && a == 1;// 1<2 && 1==1
											// T && T
		System.out.println(result);// T
		System.out.println(a <= 4 && a == b);// 1<=4 && 1==2 False
												// T && F
		System.out.println("----------");

		System.out.println(a < 5 || b == 5);// 1<5 || 2==5 True
											// T || F
		System.out.println("----------");
		System.out.println(a == b || b != 2);// 1==2 || 2!=2 False
												// F || F
		System.out.println("----------");
		System.out.println(!true);// false
		System.out.println("----------");
		System.out.println(!false);// true
		System.out.println("----------");
		System.out.println(!(1 < 2));// false
		System.out.println("----------");
		System.out.println(!(20 < 5));// true
	}

}
