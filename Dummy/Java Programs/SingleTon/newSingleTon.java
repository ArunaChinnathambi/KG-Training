public class newSingleTon {
    public static void main(String[] args) {

        private AccessMe obj = AccessMe.getObject();
        obj.i = 1;
        obj.samplemethod();

        private AccessMe obj2 = AccessMe.getObject();
        obj2.i = 2;
        obj2.samplemethod();
    }
}