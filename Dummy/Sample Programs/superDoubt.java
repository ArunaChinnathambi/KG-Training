import java.lang.Object;

public class superDoubt {
    public static void main(String args[]) {
        SomeXYZ sX = new SomeXYZ();
        sX.run();
    }
}

class SomeXYZ {
    public void run() {
        System.out.println(toString().getClass());
        System.out.println(toString().getMethod());
       // System.out.println(super.toString().getName());
        //System.out.println(java.lang.Object.toString());
    }
}