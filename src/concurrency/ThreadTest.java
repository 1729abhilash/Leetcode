package concurrency;

public class ThreadTest {

    public static void main(String[] args) {

        Counter counter = new Counter();
        MyRunnable myRunnable = new MyRunnable(counter);

        Thread t1 = new Thread(myRunnable);

        Thread t2 = new Thread(myRunnable);

        t1.start();
        t2.start();
    }
}
