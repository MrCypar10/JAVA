
import java.util.*;

public class ex3 {

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static double divide(int a, int b) {
        double div = (double) a / b;
        return div;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = add(a, b);
        System.out.println("Sum is : " + sum);

        double res = divide(a, b);
        System.out.println("Result of Div is :" + res);
    }

}
