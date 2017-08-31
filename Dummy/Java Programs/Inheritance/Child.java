public class Child extends Parent {
	static int a = 10;

	public static void main(String args[]) {
		System.out.println("hi from Child");
		System.out.println("a is " + a);
		someMethod();
	}

	public static void someMethod() {
		printSome();
	}
}