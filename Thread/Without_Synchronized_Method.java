class  BankAccount{
    private int balance = 10000;
    public void withdraw (int amount){
        System.out.println(Thread.currentThread().getName()+" is trying to withdraw Rs : "+amount);
        if(balance>=amount){
            System.out.println("Transaction Continuing.... Thread Sleeping.");

            try {
                Thread.sleep(1000);
                balance = balance-amount;
                System.out.println("Remaining Balance : " +balance);
            } catch (InterruptedException ex) {
                System.out.println("Thread Interrupted.");
            }
        }
    else{
        System.out.println(Thread.currentThread().getName()+" is Having Insufficent Balance.");
    }
    }
}
class withdrawThread extends Thread{
    private BankAccount account;
    private int amount;

    public withdrawThread(BankAccount account,int amount){
        this.account = account;
        this.amount = amount;
    }
    public void run(){
        account.withdraw(amount);
    }
}

class Without_Synchronized_Method{
    public static void main(String[] args) {
        BankAccount obj  = new BankAccount();
        withdrawThread t1 = new withdrawThread(obj, 7000);
        withdrawThread t2 = new withdrawThread(obj, 5000);
        
        t1.start();
        t2.start();

        try {
            
            t1.join();
            t2.join();

        } catch (InterruptedException ex) {
        System.out.println("Main Thread Interrupted.");
        }
    }
}

/*
      OUTPUT
============================
Thread-0 is trying to withdraw Rs : 7000
Thread-1 is trying to withdraw Rs : 5000
Transaction Continuing.... Thread Sleeping.
Transaction Continuing.... Thread Sleeping.
Remaining Balance : 5000
Remaining Balance : -2000 

*/