public class Parent extends GrandParent{
    static int a = 10;
    public static void main(String args[]){
        System.out.println("hi from Parent");
        System.out.println("a is "+a);
    
        someMethod();
    }
    public static void someMethod(){
        printSome();
    }
}