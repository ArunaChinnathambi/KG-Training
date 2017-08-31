public class toStringggg {
    public static void main(String[] args) {

        superClass se = new someTHingElse();
        System.out.println(se);
        se.runnn();
    }
}

class someTHingElse extends superClass {
    void runnn() {
        System.out.println(super);
    }
}

class superClass {
    void runnn() {
        System.out.println("this is in parent");
    }
}