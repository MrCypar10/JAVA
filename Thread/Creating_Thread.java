//CREATING THREAD WITH RUNNABLE (INTERFACE).
// Creating threads.
    class CreatingThread implements Runnable {
    public void run(){
        try {
            for(int  i = 2; i<=10; i+=2){
                System.out.println("Child ythread : " +i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread Interrupted !!");
        }
       System.out.println("Child Thread Compeleted !!"); 
    }
}
public class Creating_Thread {
    public static void main(String[] args) {
        CreatingThread t1 = new CreatingThread();
        Thread th = new Thread(t1);
        th.start();
        try {
            for(int i = 1; i <= 10; i+=2){
                System.out.println("Main Thread  : " +th);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("Main Thread Interrupted !!");
        }
        System.out.println("Main Thread Compeleted !!");
    }
}
