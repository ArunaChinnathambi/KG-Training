public class DoubleColonTest {

    interface MyInterface {
        public void interfaceMethod(String input);
    }

    public static void staticmethod(String input) {
        System.out.println(" static mymethod  " + input);
    }

    public void method1(String input) {
        System.out.println(" mymethod  " + input);
    }

    public static void main(String[] args) {
        DoubleColonTest obj = new DoubleColonTest();
        MyInterface dd = obj::method1;
        dd.interfaceMethod(" test string ");
        MyInterface second = DoubleColonTest::staticmethod;
        second.interfaceMethod(" test static string ");

    }

}