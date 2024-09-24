package multithreading;

// Synchronization using Synchronization Block

public class SynchronizationBlock {

    private double balance;

    public SynchronizationBlock(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount){

        synchronized (this){
            double newBalance = balance + amount;
            System.out.println(Thread.currentThread().getName() + "is running with updated balance = " +newBalance);

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            balance = newBalance;
        }

        System.out.println(Thread.currentThread().getName() + "is running with updated balance = " +balance);
    }

    public void withdraw(double amount){

        synchronized (this){
            if(balance >= amount){
                double newBalance = balance - amount;
                System.out.println(Thread.currentThread().getName() + "is running with updated balance = " +newBalance);

                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                balance = newBalance;
        }
            System.out.println(Thread.currentThread().getName() + "is running with updated balance = " +balance);
        }

    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args){

        SynchronizationBlock account = new SynchronizationBlock(100);

        Thread deposit1 = new Thread(() -> account.deposit(40), "deposit1");
        Thread deposit2 = new Thread(() -> account.deposit(50), "deposit2");
        Thread withdraw1 = new Thread(() -> account.withdraw(30), "withdraw1");
        Thread withdraw2 = new Thread(() -> account.withdraw(50), "withdraw2");

        deposit1.start();
        deposit2.start();
        withdraw1.start();
        withdraw2.start();

        try{
            deposit1.join();    //join() -> Main thread is waiting for all other threads to be execute
            deposit2.join();
            withdraw1.join();
            withdraw2.join();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("Final balance : " +account.getBalance());

    }

}
