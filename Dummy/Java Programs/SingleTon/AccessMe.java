public class AccessMe {
    int i = 987;

    static AccessMe am = new AccessMe();

    private AccessMe() {
    }

    static AccessMe getObject() {
        return am;
    }

    void samplemethod() {
        System.out.println("VALUE IS : " + i);
    }
}