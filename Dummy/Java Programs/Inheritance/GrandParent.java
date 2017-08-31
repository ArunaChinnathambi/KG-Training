public class GrandParent{
	static int a = 10;
	public static void main(String args[]){
		System.out.println("hi from G.Parent");
		System.out.println("a is "+a);
		printSome();
	}
	public static void printSome(){
		System.out.println("this is from GP");
	}
}