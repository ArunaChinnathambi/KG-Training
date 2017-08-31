import java.util.ArrayList;

public class MultiThread2 {
    public static void main(String[] args) {

        //an ArrayList with Threads as data type to store Thread objects, each have a SampleX's object
        ArrayList<Thread> threadList = new ArrayList<Thread>();
		
        Thread th = new Thread(new SampleX(1));
        th.setPriority(10);
		
		threadList.add(th); //for thread named 1
        threadList.add(new Thread(new SampleX(2))); //for thread named 2
        threadList.add(new Thread(new SampleX(3))); //for thread named 3
        threadList.add(new Thread(new SampleX(4))); //for thread named 4
        threadList.add(new Thread(new SampleX(5))); //for thread named 5

        for (Thread eachItem : threadList) { //running same logic on all Thread classes in the ArrayList
            eachItem.start();
            try {
                eachItem.sleep(2000);
            } catch (Exception ex) {
                System.err.println(ex);
            }
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