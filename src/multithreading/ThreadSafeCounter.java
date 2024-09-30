package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

/*
   Implement a thread-safe counter class that supports increament and decreament operations.
   Multiple threads should be able to increament and decreament the counter concurrently without any race-condition.
 */

public class ThreadSafeCounter {


    public static void main(String[] args){

        AtomicInteger counter = new AtomicInteger(0);

        Runnable increamentTask = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<=10000; i++){
                    counter.getAndIncrement();
                }
            }
        };

        Runnable decreamentTask = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<=10000; i++){
                    counter.getAndDecrement();
                }
            }
        };

        Thread increament = new Thread(increamentTask);
        Thread decreament = new Thread(decreamentTask);

        increament.start();
        decreament.start();

        try{
            increament.join();
            decreament.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final value of counter : "+counter.get());

    }

}
