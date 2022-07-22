package MemberVariable;

public class Employee {

	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "TOM");
		System.out.println(e1.id);
		System.out.println(e1.name);
		
		Employee e2 = new Employee(2, "Jerry");
		System.out.println(e2.id);
		System.out.println(e2.name);
	}

}
