package SingleLevelInheritance;

public class Son extends Father

	{
		
		String name = "TOM";
		public static void main(String[] args) {
			
			Son s = new Son();
			System.out.println(s.name);
			System.out.println(s.age);
			System.out.println("------------");
			System.out.println(s.name);
			System.out.println(s.age);
			
		}
	}
