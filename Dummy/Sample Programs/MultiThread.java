public class MultiThread {
    public static void main(String[] args) {
        Thread ob1 = new Thread(new SampleX(1));
        ob1.setPriority(1);
        ob1.start();
        Thread ob2 = new Thread(new SampleX(2));
        ob2.setPriority(2);
        ob2.start();
        Thread ob3 = new Thread(new SampleX(3));
        ob3.setPriority(3);
        ob3.start();
        Thread ob4 = new Thread(new SampleX(4));
        ob4.setPriority(4);
        ob4.start();
        Thread ob5 = new Thread(new SampleX(5));
        ob5.setPriority(5);
        ob5.start();
        Thread ob6 = new Thread(new SampleX(6));
        ob6.setPriority(6);
        ob6.start();
        Thread ob7 = new Thread(new SampleX(7));
        ob7.setPriority(7);
        ob7.start();
        Thread ob8 = new Thread(new SampleX(8));
        ob8.setPriority(8);
        ob8.start();
        Thread ob9 = new Thread(new SampleX(9));
        ob9.setPriority(9);
        ob9.start();
        Thread ob10 = new Thread(new SampleX(10));
        ob10.setPriority(10);
        ob10.start();
    }
}

class SampleX implements Runnable {
    int threadNum;

    SampleX(int num) {
        threadNum = num;
    }

    @Override
    public void run() {
        System.out.println("this is from thread " + threadNum);
    }
}