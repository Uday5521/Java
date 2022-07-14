package staticBlock;

public class Student {

	static int age;

	static {
		age = 10;

	}

	public static void main(String[] args) {
		System.out.println(Student.age);
	}

	static {
		Student.age = 20;
	}
}
