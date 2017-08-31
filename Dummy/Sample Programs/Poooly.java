abstract class My {
    public void myMethod() {
        System.out.print("Abstract implemented");
    }
}
class Poooly extends My {
    public static void main(String a[]) {
        My m = new Poooly(); 
        m.myMethod();
    }
}