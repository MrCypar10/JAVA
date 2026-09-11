class MyThread implements Runnable {
    public Thread th;

    public MyThread(String name){
        th = new Thread(this,name);
        th.start();
    }

    public void run(){
        try {
            for (int i = 2; i<=10; i+=2) {
                System.out.println(th.getName()+" : "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException ex) {
            System.out.println(th.getName()+ " Interrupted!");
        }
        System.out.println(th.getName()+" Completed!!");
    } 
}

class join {
    public static void main(String[] args) {
        MyThread obj1 = new MyThread("child 1");
        MyThread obj2 = new MyThread("child 2");
        MyThread obj3 = new MyThread("child 3");

        try {
            System.out.println("main is going to sleep");
            obj1.th.join();
            System.out.println("Hello");
            obj2.th.join();
            System.out.println("Hi");
            obj3.th.join();
            System.out.println("main is out sleep");
        } catch (InterruptedException ex) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread Completed");
    }
}