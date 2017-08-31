package LinkedList;

public class Test {
	int a;

	public static void main(String args[]) {
		Exam ex = new Exam();

		ex.a = 1;
		// x.ex.a=2;
		// ex.ex.ex.a=3;

		System.out.println(ex.a);
		// System.out.println(ex.ex.a);
		// System.out.println(ex.ex.ex.a);
	}
}

class Exam {
	int a;
	static int i = 1;
	// Exam ex = new Exam();

	Exam() {
		System.out.println("this is from level " + i);
		i++;
	}
}