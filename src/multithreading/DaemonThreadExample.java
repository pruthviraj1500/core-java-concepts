package multithreading;

public class DaemonThreadExample {

    public static void main(String[] args){

        // By using lambda expression here not necessary to create a seperate class to implement the runnable interface.
        Thread userThread1 = new Thread(() -> {

          try{
              for(int i=0; i<=10;i++){
                  System.out.println("User thread 1 : "+i);
                  Thread.sleep(1000);
              }
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
        });

        Thread daemonThread = new Thread(() -> {

            try{
                for (int i=0; i<=10;i++){
                    System.out.println("Daemon Thread : "+i);
                    Thread.sleep(2000);
                }
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        });

        userThread1.start();
        daemonThread.setDaemon(true);     //Use setDaemon() before start the thread, otherwise got exception illegalThreadStateException
        daemonThread.start();

    }

}
