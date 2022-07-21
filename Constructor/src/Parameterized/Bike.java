package Parameterized;

public class Bike {

	Bike(String brand) {
		System.out.println(brand);
	}

	public static void main(String[] args) {

		Bike b = new Bike("Pulsar");
		new Bike("Pulsar");
		new Bike("Pulsar");
		new Bike("Pulsar");
		new Bike("Pulsar");
	}

}
