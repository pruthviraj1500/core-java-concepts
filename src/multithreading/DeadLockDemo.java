package multithreading;

public class DeadLockDemo {

    public static void main(String[] args){

        Object pruthvi_key = new Object();
        Object raj_key = new Object();

        Thread pruthvi = new Thread(() -> {
            synchronized (raj_key){
                System.out.println("Pruthvi has acquired raj's key");
                try{
                    System.out.println("Pruthvi sleeping for 3 sec");
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
                System.out.println("Pruthvi woke up");
                synchronized (pruthvi_key){
                    System.out.println("Pruthvi has got his key");
                }
            }
        });

        Thread raj = new Thread(() -> {
            synchronized (raj_key){
                System.out.println("Raj has acquired pruthvi's key");
                try{
                    System.out.println("Raj sleeping for 3 sec");
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
                System.out.println("Raj woke up");
                synchronized (pruthvi_key){
                    System.out.println("Raj has got his key");
                }
            }

        });

        pruthvi.start();
        raj.start();

    }

}
