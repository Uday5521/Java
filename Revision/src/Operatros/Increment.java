package Operatros;

public class Increment {
	public static void main(String[] args) {

		System.out.println("Program started");
		
		int a=10;
		int b=10;
		int res;

		res = ++a + 10;
		     //11  + 10 = 21
		System.out.println(res);
		
		res = b++ +10;
		 	//10 + 10 = 20
		System.out.println(res);
		
		System.out.println("Program ended");
	}

}
