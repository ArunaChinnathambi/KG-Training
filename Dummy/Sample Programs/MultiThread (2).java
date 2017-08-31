public class MultiThread {
    public static void main(String[] args) {
        Thread ob1 = new Thread(new SampleY());
        ob1.start();
        Thread ob2 = new Thread(new SampleY());
        ob2.start();
        Thread ob3 = new Thread(new SampleY());
        ob3.start();
        Thread ob4 = new Thread(new SampleY());
        ob4.start();
        Thread ob5 = new Thread(new SampleY());
        ob5.start();
        Thread ob6 = new Thread(new SampleY());
        ob6.start();
        Thread ob7 = new Thread(new SampleY());
        ob7.start();
        Thread ob8 = new Thread(new SampleY());
        ob8.start();
        Thread ob9 = new Thread(new SampleY());
        ob9.start();
        Thread ob10 = new Thread(new SampleY());
        ob10.start();
    }
}

class SampleY implements Runnable {
    static int i;

    public void run() {
        System.out.println("this is from thread " + (++i));
    }
}