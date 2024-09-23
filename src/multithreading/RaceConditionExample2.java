package multithreading;

class BankCheckThenWrite implements Runnable{

    int balance = 100;

    public void run(){
        System.out.println("Waiting to withdraw the money : " + Thread.currentThread().getName());

        synchronized (this){
            if(balance >= 100){
                System.out.println("Withdrawing money : " + Thread.currentThread().getName());
                balance -= 50;
            }else {
                System.out.println("Withdrawal not done for : " + Thread.currentThread().getName());
            }
            System.out.println("Withdrawal done , final balance : " + balance);
        }

    }
}

public class RaceConditionExample2 {

    public static void main(String[] args){
        System.out.println("In main method");

        BankCheckThenWrite bankCheckThenWrite = new BankCheckThenWrite();

        Thread pruthvi = new Thread(bankCheckThenWrite , "pruthvi");
        Thread raj = new Thread(bankCheckThenWrite,"raj");

        pruthvi.start();
        raj.start();

    }

}
