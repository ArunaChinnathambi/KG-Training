public class SomeClass {

    public static void main(String[] args) {
        SomeOtherClass soc = new SomeOtherClass();
        try {
            soc.runThis();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}