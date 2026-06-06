
import java.util.*;

class ex2 {

    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println("sum is : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a = sc.nextInt();

        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();

        add(a, b);
    }

}
