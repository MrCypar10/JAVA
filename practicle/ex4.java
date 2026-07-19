 
import java.util.*;

class ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int a = sc.nextInt();
        while (a > 9) {

            a = a / 10;
        }
        System.out.println("First Digit on the number is : " + a);

    }
}
