public class MySingleTon {
    int a = 0;

    private MySingleTon() {
    }

    public static MySingleTon myObj = new MySingleTon();

    public static MySingleTon getInstance() {
        return myObj;
    }

    public static void main(String a[]) {

        MySingleTon st1 = MySingleTon.getInstance();
        st1.a = 2;
        System.out.println(st1.a);
        System.out.println(st1.hashCode());

        MySingleTon st2 = MySingleTon.getInstance();
        st2.a = 5;
        System.out.println(st2.a);
        System.out.println(st2.hashCode());

        MySingleTon st3 = new MySingleTon();
        st3.a = 999;
        System.out.println(st3.a);
        System.out.println(st3.hashCode());

    }
}