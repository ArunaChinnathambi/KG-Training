public class SingleTon {
    public static void main(String[] args) {
        System.out.println("This is working");

        SingleTonX sx;

        sx = SingleTonX.getInstance(1);
    }
}

class SingleTonX {

    int count;

    SingleTonX() {}

    SingleTonX getInstance(int num) {
        count = num;
        return this;
    }

}