
import java.util.*;

public class Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Number");

        int a  =sc.nextInt();
        int b = sc.nextInt();

        try {
            int c = a/b;
            System.out.println("Div is "+c);
        } catch (ArithmeticException e) {
            System.out.println("Denominator Should be non-zero.");
        }
        int d =a+b;
        System.out.println("Sum is "+d);
    }    
}
