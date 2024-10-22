package multithreading;

class Greek{
    public void m1(){
        System.out.println("In m1 method of Greek class");
    }
}

public class ThreadByRunnableInterface extends Greek implements Runnable{

    public void run(){
        System.out.println("In run method");
    }

    public static void main(String[] args){

        ThreadByRunnableInterface t1 = new ThreadByRunnableInterface();
        t1.m1();

        Thread th = new Thread(t1);
        th.start();

        Thread th2 = new Thread(t1);
        th2.start();

        System.out.println("In main method");

    }

}
