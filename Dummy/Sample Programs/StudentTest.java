class Student {
	String name;
	int rollno, age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayName() {
		System.out.println(getName());
	}

	/*
	 * public String toString() { return "Student [name=" + name + ", rollno=" +
	 * rollno + ", age=" + age + "]"; }
	 */
}

public class StudentTest {
	public static void main(String... args) {
		Student std = new Student();
		std.name = "John";
		std.displayName();

		Student std1 = new Student();
		std1.name = "Paul";
		std1.displayName();
		System.out.println(std1.toString());
		System.out.println(std);

	}
}