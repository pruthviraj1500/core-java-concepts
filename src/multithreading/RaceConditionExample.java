package multithreading;

//read - modify - write race condition example

class MyCustomThread implements Runnable{

    int shared = 0;

    public void run(){
        for(int i = 0; i<10000; i++){
            shared++;
        }
    }

    public int  getCount(){
        return shared;
    }
}

public class RaceConditionExample {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("In main method");

        MyCustomThread myCustomThread = new MyCustomThread();

        Thread t1 = new Thread(myCustomThread);
        Thread t2 = new Thread(myCustomThread);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final value of shared counter : "+myCustomThread.getCount());

    }
}
