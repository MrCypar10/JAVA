class SharedData{
    private int x;
    private boolean isConsumed = true;

    public synchronized void set(int i){
        if(isConsumed==false){
            try{
                System.out.println("Producer is waiting with :" +i);
                wait();
            }catch(InterruptedException ex){
                System.out.println("Producer Interrupted!!");
            }
        }
            x=i;
            isConsumed=false;
            notify();
    }
    public synchronized int get(){
        if(isConsumed==true){
            try{
                System.out.println("Consumer is waiting for Consuming :" +x);
                wait();
            }catch(InterruptedException ex){
            }
        }
            isConsumed=true;
            notify();

            return x;
    }

}

class Producer extends Thread{
    private SharedData obj;

    public Producer(SharedData obj){
        this.obj = obj;
    }

    public void run(){
        try {
            for(int i = 1; i<=10;i++){
               obj.set(i); 
                System.out.println("Produced :" +i);
                Thread.sleep((int)(Math.random()*3000));
            }
        } catch (InterruptedException ex) {
        System.out.println("Producer Interrupted.");
        }
    }
}

class Consumer extends Thread{
    private SharedData obj;

    public Consumer(SharedData obj){
        this.obj = obj;
    }

    public void run(){
        try {
            int sum = 0;
            for(int i = 1; i<=10;i++){
               int n = obj.get(); 
                System.out.println("Consumed :" +n);
                sum =sum +n;
                Thread.sleep((int)(Math.random()*3000));    
            }
            System.out.println("Sum is : "+sum);

        }
         catch (InterruptedException ex) {
        System.out.println("Consumer Interrupted.");
        }
    }
}

public class ProducerConsumerProblem{
    public static void main(String[] args) {
        SharedData obj = new SharedData();
        Producer p = new Producer(obj);
        Consumer c = new Consumer(obj);

        p.start();
        c.start();

        try{
            p.join();
            c.join();

        }catch(InterruptedException ex){
            System.out.println("Main Interrupted!!");
        }
        System.out.println("Main Finished");
    }
}