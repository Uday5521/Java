package MemberVariable;

public class Kangroo {
	
	double height = 5.5;//Member Variable
	
	void display()
	
	{
		
		double height = 4.4;//Local Variable
		System.out.println(height);
		System.out.println(this.height);
		
	}
	public static void main(String[] args) {
		
		Kangroo k = new Kangroo();
		k.display();
	}

	
}
