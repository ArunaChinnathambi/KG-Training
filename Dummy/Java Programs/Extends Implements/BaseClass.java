public class BaseClass extends Extender implements interfaceI {
    public static void main(String[] args) {
        System.out.println("this is from Main");
        BaseClass bc = new BaseClass();
        int i = bc.sum(1, 2);
        System.out.println(i);
    }

    public int sum(int x, int y) {
        return x + y;
    }
}