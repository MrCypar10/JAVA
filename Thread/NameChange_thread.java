public class NameChange_thread {
    public static void main(String[] args) {
        Thread th = Thread.currentThread();
        System.out.println("Before Thread Name Changed. (Default) : "+th );

        th.setName("Cypar"); // Setting Thread Name.
        System.out.println("After Thread Name Changed. : "+th );
        
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(th.getName()+" : " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
        System.out.println(th.getName() +" Interrupted !!");
        }
        System.out.println(th.getName()+"  Compeleted!!");
    
    }
}
