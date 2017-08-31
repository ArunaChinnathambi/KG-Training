abstract class My {
    public void myMethod() {
        System.out.print("Abstract");
    }
}
class Pooly extends My {
    public static void main(String a[]) {
        My m = new Pooly(); //{};
        m.myMethod();
    }
}