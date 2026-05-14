
import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        int n, mul = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        while (n >= 1) {
            mul = mul * n;
            n--;
        }
        if (n < 0) {
            System.out.println("Invalid Input");
        } 
        else 
        System.out.println("Factorial is : " + mul);
    }

}
