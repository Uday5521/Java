package SuperCallingStatement;

public class Enginee extends Car {
	
	Enginee(){
		super();// Implicit
		System.out.println("Green car");
	}
	
	public static void main(String[] args) {
		
		new Enginee();
	}

}
