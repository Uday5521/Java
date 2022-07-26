package ExplicitSuperCallingStatement;

public class Son extends Father {
	
	Son()
	{
		super("Tom");
		System.out.println("Bye");
	}
		
	public static void main(String[] args) {
		
		new Son();
	}

}
