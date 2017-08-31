import java.util.ArrayList;

public class MultiThread2 {
    public static void main(String[] args) {

        //an ArrayList with Threads as data type to store Thread objects, each have a SampleX's object
        ArrayList<Thread> threadList = new ArrayList<Thread>();
        threadList.add(new Thread(new SampleX(1))); //for thread named 1
        threadList.add(new Thread(new SampleX(2))); //for thread named 2
        threadList.add(new Thread(new SampleX(3))); //for thread named 3
        threadList.add(new Thread(new SampleX(4))); //for thread named 4
        threadList.add(new Thread(new SampleX(5))); //for thread named 5

        threadList.get(0).setPriority(10);
        threadList.get(1).setPriority(1);
        threadList.get(2).setPriority(1);
        threadList.get(3).setPriority(1);
        threadList.get(4).setPriority(1);

        for (Thread eachItem : threadList) { //running same logic on all Thread classes in the ArrayList
            eachItem.start();
        }
    }
}

class SampleX implements Runnable {
    int threadNum;

    SampleX(int a) {
        threadNum = a; //thread number can be set from calling class
    }

    @Override
    public void run() {
        while (true) { //infinate loop. so we can see how Threads are running randomly, but not at same time
            for (int counter = 1; counter <= threadNum; counter++)
                System.out.print("\t"); //loop thread number of times, to show gap between outputs
            System.out.println(threadNum);
        }
    }
}