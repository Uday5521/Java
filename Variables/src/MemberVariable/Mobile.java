package MemberVariable;

public class Mobile {
	
	String brand;
	int cost;
	
	Mobile(String brand,int cost){
		this.brand=brand;
		this.cost=cost;
	}
	
	
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile("Iphone",70000);
		System.out.println(m1.brand+ " "+m1.cost);

		Mobile m2 = new Mobile("MI", 15000);
		System.out.println(m2.brand+" "+m2.cost);
	}

}
