abstract class Test {
   public void method() {
        System.out.println("Abstract class is called");
    }
}

class Testing extends Test {
    public static void main(String... a) {
        //Test t = new Testing();
        //Test t = new Test(){};
       // Testing t = new Testing(){};
        Testing t = new Testing();
    
        t.method();
    }
}