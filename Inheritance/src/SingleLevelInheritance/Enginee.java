package SingleLevelInheritance;

public class Enginee extends Car{
	
	String cc = "200CC";
	
	public static void main(String[] args) {
		
		Enginee e = new Enginee();
		
		System.out.println(e.cc);
		System.out.println(e.color);
		System.out.println(e.price);
		
	}

}
