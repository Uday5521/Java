package MultilevelInheritance;

public class MainClass {
	public static void main(String[] args) {
		
		Departement d = new Departement();
		
		System.out.println("University Name: "+d.universityName);
		System.out.println("College Name: "+d.collegeName);
		System.out.println("Department Name: "+d.departmentName);
		System.out.println("---------------------");
		
		d.ConductMock();
		d.ConductFest();
		d.ConductExams();
	}

}
