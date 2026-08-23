
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        try {
            for (int i=2; i<=10; i+=2){
                System.out.println(super.getName()+" : "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException ex) {
            System.out.println(super.getName()+ " Interrupted");
        }
        System.out.println(super.getName()+" Completed");
    }
}
public class ExtndindThreadClass {
    public static void main(String[] args) {
        MyThread th = new MyThread("Child-Thread");
        System.out.println(th);
        th.start();
        try {
            for (int i = 1; i <=10; i+=2){
              System.err.println("Main-Thread: " + i);
              Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println("main-thread interrupted");
        }
        System.out.println("main-thread Completed");
    }
    
}
