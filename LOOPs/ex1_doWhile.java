
import java.util.Scanner;

 class ex1_doWhile{
    public static void main(String [] args){
        Scanner sc  =new Scanner(System.in);
       String choice;
       
       do{
        System.out.println("Enter The Numbers : ");    
        int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum is: "+(a+b));
            System.out.println("Do you Wanna Try Again (Yes/No)");
            choice = sc.next();

    }while(choice.equalsIgnoreCase("Yes"));
}
 }