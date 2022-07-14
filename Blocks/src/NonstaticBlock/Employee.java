package NonstaticBlock;

public class Employee {
	int id;
	
	{
		id = 10;
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println("ID: "+e.id);
	} 
	
	{
		id = 20;
	}
	{
		id = 30;
	}
}
