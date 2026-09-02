//"Using Shared Data in 2 Threads with Synchornized Keyword"


class  BankAccount1{
    private int balance = 10000;
    public synchronized void withdraw (int amount){
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


class withdrawThread1 extends Thread{
    private BankAccount1 account;
    private int amount;

    public withdrawThread1(BankAccount1 account,int amount){
        this.account = account;
        this.amount = amount;
    }
    public void run(){
        account.withdraw(amount);
    }
}



class With_synchronized_Method{
    public static void main(String[] args) {
        BankAccount1 obj  = new BankAccount1();
        withdrawThread1 t1 = new withdrawThread1(obj, 7000);
        withdrawThread1 t2 = new withdrawThread1(obj, 5000);
        
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

