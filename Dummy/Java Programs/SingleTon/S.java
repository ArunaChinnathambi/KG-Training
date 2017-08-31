class S {
    private static S m = new S();

    private S() {
        System.out.println("constructor");
    }

   public static S getmethod() {
        System.out.println("get method");
        return m;
    }}

class D{

    public static void main(String args[]) {
        S pp = S.getmethod();
}
}