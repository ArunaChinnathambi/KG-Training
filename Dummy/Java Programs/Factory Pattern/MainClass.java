public class MainClass {
    public static void main(String[] args) {
        Factory fsc = new Factory();

        Phone iPhone = fsc.getPhone(Data.iPhone);
        iPhone.functionality();
        System.out.println(iPhone);

        Phone samsung = fsc.getPhone(Data.samsung);
        samsung.functionality();
        System.out.println(samsung);

        Phone sony = fsc.getPhone(Data.sony);
        sony.functionality();
        System.out.println(sony);
    }
}