package ExplicitSuperCallingStatement;

public class Enginee extends Car {
	
	 Enginee() {
		 super("Car is Benz");
		 System.out.println("BMW");
	}

	 public static void main(String[] args) {
		new Enginee();
	}
}
