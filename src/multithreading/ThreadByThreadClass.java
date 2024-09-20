package multithreading;

public class ThreadByThreadClass extends Thread{

    public void run(){
        System.out.println("Inside run method");
    }

    public static void main(String[] args){

        ThreadByThreadClass t1 = new ThreadByThreadClass();
        t1.start();
        System.out.println("In main method");

    }
}
