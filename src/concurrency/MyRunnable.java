package concurrency;

public class MyRunnable implements Runnable {

    private Counter counter = null;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i=1; i<=100000; i++ ){
            counter.increment();
        }

        System.out.println("ThreadName: " + Thread.currentThread().getName() +" Counter: " + counter.getCount());
    }
}
