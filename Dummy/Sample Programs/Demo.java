interface Test {
	abstract void greet();
}

public class Demo {
	public static void main(String[] args) {
		Test t = new Test() {
			public void greet() {
				System.out.print("\nHi, Best wishes to way2java.com\n");
			}
		};
		t.greet();
	}
}