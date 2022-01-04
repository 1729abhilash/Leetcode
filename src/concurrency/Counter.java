package concurrency;

public class Counter {

    private static int count = 0;

    public void increment() {
        //int a = b + c;
       // int y = a + c;
        ///int d =  y + z;

        synchronized (this){
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
