abstract class Test {
  static void display() {
    System.out.println("Hello 1");
  }
    abstract void display2();
}

class Demo2{
  public static void main(String args[]) {
	
	Test t1 = new Test(){
		void display2(){
			System.out.println("this is from 2");
		}
	};
	
	t1.display2();
  }

}