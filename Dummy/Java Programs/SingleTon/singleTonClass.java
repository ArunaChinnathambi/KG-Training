public class singleTonClass {

    static singleTonClass thisObj = new singleTonClass();

    private singleTonClass() {
    }

    static singleTonClass getObject() {
        return thisObj;
    }

    void test() {
        System.out.println("this is working");
        System.out.println(this.hashCode());
    }
}